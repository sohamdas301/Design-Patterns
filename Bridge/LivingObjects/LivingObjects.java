package Bridge.LivingObjects;

import Bridge.BreathingTechniques.BreatheImplementor;

public abstract class LivingObjects {
    BreatheImplementor breatheImplementor;
    public LivingObjects(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }
    public abstract void breathe();
}
