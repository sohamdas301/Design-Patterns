package State;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        VendingMachine machine = new VendingMachine();
        List<Item> items = addItems();
        machine.setItems(items);
        machine.setVendingMachineState(new IdleState(machine));
        diplayVendingMachineStates(machine);
        machine.getVendingState().clickOnInsertCoinButton(machine);
        machine.getVendingState().insertCoin(machine, Coin.QUARTER);
        machine.getVendingState().clickOnStartProductButtonSelection(machine);
        machine.getVendingState().ChooseProduct(machine, 102);
        Item item = machine.getVendingState().dispenseProduct(machine, 102);
        System.out.println("Got returned product as " + item.getItemName());
        diplayVendingMachineStates(machine);
    }

    static void diplayVendingMachineStates(VendingMachine machine) {
        System.out.println("Vending machice is in " + machine.getVendingState() + " state");
        System.out.println("Displaying items: ");
        for(Item item : machine.getItems()) {
            System.out.println(item.getItemName() + " " + item.getQuantity() + " " + item.getPrice() + " " + item.getCode());
        }
    }

    static List<Item> addItems() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item("Coke", 20, 10, 101);
        items.add(item1);
        Item item2 = new Item("Kurkure", 10, 5, 102);
        items.add(item2);
        return items;
    }
}
