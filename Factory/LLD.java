package Factory;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new Module1());
    }
}
