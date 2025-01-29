package Problems.Parking_Lot.Entrance;

import Problems.Parking_Lot.ParkingSpotManager.ParkingSpotManagerFactory;
import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Ticket.Ticket;
import Problems.Parking_Lot.Vehicle.Vehicle;
import Problems.Parking_Lot.Vehicle.VehicleType;

import java.time.LocalDate;
import java.util.Locale;

public class Entrance {
    long entranceGateNumber;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    public Entrance(long entranceGateNumber, String vehicleType) {
        this.entranceGateNumber = entranceGateNumber;
        vehicle = new Vehicle(1, VehicleType.TWO_WHEELER);
    }
    public Ticket generateTicket() {
        parkingSpot =  ParkingSpotManagerFactory.getParkingSpotManager(vehicle).findNearestParkingSpot(entranceGateNumber);
        if(parkingSpot == null) return null;
        Ticket ticket = new Ticket((long) Math.random(), LocalDate.now().getMonthValue(), parkingSpot, vehicle);
        updateParkingSpot();
        return ticket;
    }

    private ParkingSpot findParkingSpot() {
        return  ParkingSpotManagerFactory.getParkingSpotManager(vehicle).findNearestParkingSpot(entranceGateNumber);
    }
    private void updateParkingSpot() {
        parkingSpot.parkVehicle(vehicle);
    }
}
