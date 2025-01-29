package Problems.Parking_Lot.Parking_Spot;

import Problems.Parking_Lot.Vehicle.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(int parkingSportNumber, Vehicle vehicle, boolean isEmpty) {
        super(parkingSportNumber, vehicle, isEmpty);
    }
    @Override
    public double getPrice() {
        return 50;
    }
}
