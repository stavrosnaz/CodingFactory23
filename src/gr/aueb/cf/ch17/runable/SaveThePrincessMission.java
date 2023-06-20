package gr.aueb.cf.ch17.runable;

public class SaveThePrincessMission implements IMission {
    private MissionStatus status = MissionStatus.NOT_STARTED;


    @Override
    public MissionStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MissionStatus status) {
        this.status = status;
    }

    @Override
    public void embark() {
        System.out.println("Save the princess");
    }
}
