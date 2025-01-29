package Bridge.LivingObjects;

import Bridge.BreathingTechniques.BreatheImplementor;

public class Fish extends LivingObjects{
    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
