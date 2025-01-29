package State;

import java.util.List;

public class VendingMachine {
    VendingState vendingMachineState;
    List<Coin> coinList;
    List<Item> items;

    public VendingState getVendingState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
