package Problems.Parking_Lot.PriceStratergy;

import Problems.Parking_Lot.Parking_Spot.ParkingSpot;
import Problems.Parking_Lot.Ticket.Ticket;

import java.time.LocalDate;
import java.util.Date;

public class HourlyPriceStratergy extends PriceStratergy{
    public HourlyPriceStratergy(Ticket ticket) {
        super(ticket);
    }
    @Override
    public double getPrice() {
        return (new Date().getTime() - ticket.getEntryTime()) * ticket.getParkingSpot().getPrice();
    }
}
