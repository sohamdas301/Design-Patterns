package Problems.Parking_Lot.CostCalculator;

import Problems.Parking_Lot.PriceStratergy.HourlyPriceStratergy;
import Problems.Parking_Lot.PriceStratergy.MinutesPriceStratergy;
import Problems.Parking_Lot.Ticket.Ticket;

public class CostCalculatorFactory {
    public static CostCalulator getCostCalcultor(Ticket ticket) {
        switch (ticket.getVehicle().getVehicleType()) {
            case TWO_WHEELER -> {
                return new TwoWheelerCostCalculator(new HourlyPriceStratergy(ticket));
            }
            case FOUR_WHEELER -> {
                return new FourWheelerCostCalculator(new MinutesPriceStratergy(ticket));
            }
        }
        return null;
    }
}
