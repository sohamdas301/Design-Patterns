package Bridge.LivingObjects;

import Bridge.BreathingTechniques.BreatheImplementor;

public class Cat extends LivingObjects{
    public Cat(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breathe() {
        breatheImplementor.breathe();
    }
}
