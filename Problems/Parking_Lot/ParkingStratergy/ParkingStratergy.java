package Problems.Parking_Lot.ParkingStratergy;

import Problems.Parking_Lot.Entrance.Entrance;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;

public interface ParkingStratergy {
    public ParkingSpot find(long entranceGateNumber);
}
