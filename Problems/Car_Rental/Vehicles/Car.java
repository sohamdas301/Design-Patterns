package Problems.Car_Rental.Vehicles;

public class Car extends Vehicle {
    public static VehicleType type = VehicleType.CAR;

    public Car(String vehicleNumber, ComfortType comfortType, double pricePerDay) {
        super(vehicleNumber, comfortType, pricePerDay);
    }
}
