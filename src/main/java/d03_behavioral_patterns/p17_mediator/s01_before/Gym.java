package d03_behavioral_patterns.p17_mediator.s01_before;

public class Gym {

    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
