package Strategy;

/*
* This design pattern is specifically used to remove the effort to write/maintain the duplicate code.
* In this example parent class Vehicle has one generic drive method.Its subclasses might need same or
* different drive strategies.Hence the logic to implement drive is separated from the implementing class
* as the client can directly pass the drive strategy can the parent class will receive the same.
* Suppose in class A B C, A and C requires same driving strategy but different from parent then while overriding
* we had to duplicate the code,but using this pattern we are sending the driving strategy object from client itself
* and based of this strategy the main class will behave.The reason to keep interface is :
* 1) In future if new strategy comes it only has to implement the interface and the drive method name remains
* consistent
* 2) If not passed as interface the in main class we have to make objects of different driving strategy each time
*/
public class Main {
    public static void main(String[] args) {
//        DriveType driveType = new SpecialDrive();
//        Vehicle vehicle = new SportVehicle(driveType);
        DriveType driveType = new NormalDrive();
        Vehicle vehicle = new PassengerVehicle(driveType);
        vehicle.drive();
    }
}
