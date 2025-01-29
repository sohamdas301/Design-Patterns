package Problems.Parking_Lot.ParkingSpotManager;

import Problems.Parking_Lot.ParkingStratergy.NearestToEntranceParkingStratergy;
import Problems.Parking_Lot.ParkingStratergy.ParkingStratergy;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStratergy parkingStratergy) {
        super(parkingSpots, parkingStratergy);
    }
}
