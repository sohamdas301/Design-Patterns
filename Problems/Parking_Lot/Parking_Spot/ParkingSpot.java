package Problems.Parking_Lot.Parking_Spot;

import Problems.Parking_Lot.Vehicle.Vehicle;

public abstract class ParkingSpot {
    private int parkingSportNumber;
    private Vehicle vehicle;
    private boolean isEmpty = true;

    public int getParkingSportNumber() {
        return parkingSportNumber;
    }

    public void setParkingSportNumber(int parkingSportNumber) {
        this.parkingSportNumber = parkingSportNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot(int parkingSportNumber, Vehicle vehicle, boolean isEmpty) {
        this.parkingSportNumber = parkingSportNumber;
        this.vehicle = vehicle;
        this.isEmpty = isEmpty;
    }

    public abstract double getPrice();

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }
}
