package Problems.Parking_Lot.ExitGate;

import Problems.Parking_Lot.CostCalculator.CostCalculatorFactory;
import Problems.Parking_Lot.ParkingSpotManager.ParkingSpotManagerFactory;
import Problems.Parking_Lot.PriceStratergy.PriceStratergy;
import Problems.Parking_Lot.Ticket.Ticket;

public class ExitGate {
    private Ticket ticket;
    private PriceStratergy priceStratergy;
    public ExitGate(Ticket ticket, PriceStratergy priceStratergy) {
        this.ticket = ticket;
        this.priceStratergy = priceStratergy;
    }
    public double calculatePrice() {
        return CostCalculatorFactory.getCostCalcultor(this.ticket).calculatePrice();
    }
    public void updateParkingSpot() {
        ParkingSpotManagerFactory.getParkingSpotManager(ticket.getVehicle()).removeParkingSpace(ticket.getParkingSpot());
    }
}
