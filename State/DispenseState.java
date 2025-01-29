package State;

import java.util.List;

public class DispenseState implements VendingState {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Can't click on clickOnInsertCoinButton button in DispenseState state");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Can't insert coin in DispenseState state");
    }

    @Override
    public void clickOnStartProductButtonSelection(VendingMachine machine) throws Exception {
        throw new Exception("Can't click on clickOnStartProductButtonSelection button in DispenseState state");
    }

    @Override
    public void ChooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't choose product in DispenseState state");
    }

    @Override
    public void getChange(int amountEnteredByUser, int itemPrice) throws Exception {
        throw new Exception("Change has already been dispatched if any");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Can't refund money in DispenseState state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        for(Item item : machine.getItems()) {
            if(item.getCode() == codeNumber) {
                item.setQuantity(item.getQuantity() - 1);
                machine.setVendingMachineState(new IdleState(machine));
                return item;
            }
        }
        machine.setVendingMachineState(new IdleState(machine));
        return null;
    }
}
