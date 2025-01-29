package State;

import java.util.List;

public class SelectionState implements VendingState {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Cannot Click insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Cannot insert coin in selection state");
    }

    @Override
    public void clickOnStartProductButtonSelection(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void ChooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        int amountEnteredByUser = 0;
        for(Coin amount : machine.getCoinList()) amountEnteredByUser += amount.value;

        for(Item item : machine.getItems()) {
            if(item.getCode() != codeNumber) continue;
            if(item.getQuantity() == 0) {
                this.refundFullMoney(machine);
                throw new Exception("Insufficient Quantity");
            }
            if(amountEnteredByUser < item.getPrice()) {
                this.refundFullMoney(machine);
                throw new Exception("Insufficient money inserted");
            }
            getChange(amountEnteredByUser, item.getPrice());
            machine.setVendingMachineState(new DispenseState());
        }
    }

    @Override
    public void getChange(int amountEnteredByUser, int itemPrice) throws Exception {
        System.out.println("Returning " + (amountEnteredByUser - itemPrice) + " change");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new IdleState(machine));
        System.out.println("Refunded all money and back to idle state");
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense product in selection state");
    }
}
