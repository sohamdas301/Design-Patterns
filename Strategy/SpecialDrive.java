package Strategy;

public class SpecialDrive implements DriveType{
    @Override
    public void drive() {
        System.out.println("Special Drive Type");
    }
}
