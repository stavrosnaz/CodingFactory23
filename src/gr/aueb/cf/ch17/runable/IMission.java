package gr.aueb.cf.ch17.runable;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus status);
    void embark();
}
