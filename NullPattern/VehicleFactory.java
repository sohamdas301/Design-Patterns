package NullPattern;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "Car" : return new Car();
        }
        return new NullObject();
    }
}
