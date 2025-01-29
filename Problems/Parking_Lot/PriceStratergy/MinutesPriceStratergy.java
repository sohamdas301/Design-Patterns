package Problems.Parking_Lot.PriceStratergy;

import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Ticket.Ticket;

import java.util.Date;

public class MinutesPriceStratergy extends PriceStratergy{
    public MinutesPriceStratergy(Ticket ticket) {
        super(ticket);
    }
    @Override
    public double getPrice() {
        // Make below calculation as per minutes
        return (new Date().getTime() - ticket.getEntryTime()) * ticket.getParkingSpot().getPrice();
    }
}
