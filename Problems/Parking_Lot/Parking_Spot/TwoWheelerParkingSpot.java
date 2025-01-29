package Problems.Parking_Lot.Parking_Spot;

import Problems.Parking_Lot.Vehicle.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(int parkingSportNumber, Vehicle vehicle, boolean isEmpty) {
        super(parkingSportNumber, vehicle, isEmpty);
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
