package gr.aueb.cf.ch16.knight;

@FunctionalInterface
public interface IKnight {

    // Final static field
    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
