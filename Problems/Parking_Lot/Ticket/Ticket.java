package Problems.Parking_Lot.Ticket;

import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Vehicle.Vehicle;

public class Ticket {
    private long ticketNumber;
    private long entryTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;

    public Ticket(long ticketNumber, long entryTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.ticketNumber = ticketNumber;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public long getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(long ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
