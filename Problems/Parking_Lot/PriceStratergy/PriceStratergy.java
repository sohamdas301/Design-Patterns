package Problems.Parking_Lot.PriceStratergy;

import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Ticket.Ticket;

public abstract class PriceStratergy {
    Ticket ticket;
    public PriceStratergy(Ticket ticket) {
        this.ticket = ticket;
    }
    public abstract double getPrice();
}
