package Problems.Parking_Lot.ParkingSpotManager;

import Problems.Parking_Lot.ParkingStratergy.ParkingStratergy;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStratergy parkingStratergy) {
        super(parkingSpots, parkingStratergy);
    }
}
