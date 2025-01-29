package Bridge.BreathingTechniques;

public class LandBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathing on Land");
    }
}
