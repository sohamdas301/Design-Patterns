package Factory;

public class HLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new Module2());
    }
}
