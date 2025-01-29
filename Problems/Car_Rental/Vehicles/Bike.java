package Problems.Car_Rental.Vehicles;

public class Bike extends Vehicle {
    public static VehicleType type = VehicleType.BIKE;

    public Bike(String vehicleNumber, ComfortType comfortType, double pricePerDay) {
        super(vehicleNumber, comfortType, pricePerDay);
    }
}
