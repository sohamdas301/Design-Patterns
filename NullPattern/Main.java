package NullPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        printVehicleInfo(vehicle);
    }
    private static void printVehicleInfo(Vehicle vehicle) {
        System.out.println("Seating Capacity is :" + vehicle.getSeatingCapacity());
        System.out.println("Fuel Capacity is :" + vehicle.getTankCapacity());
    }
}
