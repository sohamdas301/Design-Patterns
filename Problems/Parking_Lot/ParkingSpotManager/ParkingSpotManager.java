package Problems.Parking_Lot.ParkingSpotManager;

import Problems.Parking_Lot.Entrance.Entrance;
import Problems.Parking_Lot.ParkingStratergy.ParkingStratergy;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    ParkingStratergy parkingStratergy;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStratergy parkingStratergy) {
        this.parkingSpots = parkingSpots;
        this.parkingStratergy = parkingStratergy;
    }

    public ParkingSpot findNearestParkingSpot(long entranceGateNumber) {
        return this.parkingStratergy.find(entranceGateNumber);
    }

    public void addParkingSpace(ParkingSpot parkingSpot) {
        this.parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpace(ParkingSpot parkingSpot) {
        this.parkingSpots.remove(parkingSpot);
    }

}
