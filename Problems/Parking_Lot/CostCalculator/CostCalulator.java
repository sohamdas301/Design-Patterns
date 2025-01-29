package Problems.Parking_Lot.CostCalculator;

import Problems.Parking_Lot.PriceStratergy.PriceStratergy;

public abstract class CostCalulator {
    PriceStratergy priceStratergy;
    public CostCalulator(PriceStratergy priceStratergy) {
        this.priceStratergy = priceStratergy;
    }
    public double calculatePrice() {
        return this.priceStratergy.getPrice();
    }
}
