package Strategy;

public class NormalDrive implements DriveType{
    @Override
    public void drive() {
        System.out.println("Normal Drive Type");
    }
}
