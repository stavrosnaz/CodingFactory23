package gr.aueb.cf.ch11;

/**
 * Lazy instantiation
 * Singleton pattern
 */
public class CodingFactoryLazy {

    private static CodingFactoryLazy INCSTANCE = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (INCSTANCE == null) {
            INCSTANCE = new CodingFactoryLazy();
        }

        return INCSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
