package Bridge;

import Bridge.BreathingTechniques.LandBreatheImplementor;
import Bridge.BreathingTechniques.WaterBreatheImplementor;
import Bridge.LivingObjects.Cat;
import Bridge.LivingObjects.Fish;
import Bridge.LivingObjects.LivingObjects;

public class Main {
    public static void main(String[] args) {
        LivingObjects fish = new Fish(new WaterBreatheImplementor());
        LivingObjects cat = new Cat(new LandBreatheImplementor());
        fish.breathe();
        cat.breathe();
    }
}
