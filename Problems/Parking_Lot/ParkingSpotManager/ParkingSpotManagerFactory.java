package Problems.Parking_Lot.ParkingSpotManager;


import Problems.Parking_Lot.ParkingStratergy.NearestToEntranceParkingStratergy;
import Problems.Parking_Lot.ParkingStratergy.ParkingStratergy;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Vehicle.Vehicle;
import Problems.Parking_Lot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {
    static List<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
    static List<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
    static ParkingStratergy twoWheelerParkingStrategy = new NearestToEntranceParkingStratergy();
    static ParkingStratergy fourWheelerParkingStrategy = new NearestToEntranceParkingStratergy();
    public static ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        if(vehicle.getVehicleType() == VehicleType.TWO_WHEELER) {
            return new TwoWheelerParkingSpotManager(twoWheelerParkingSpots, twoWheelerParkingStrategy);
        } else {
            return new FourWheelerParkingSpotManager(fourWheelerParkingSpots, fourWheelerParkingStrategy);
        }
    }
}
