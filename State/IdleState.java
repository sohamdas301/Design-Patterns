package State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements VendingState{
    public IdleState(VendingMachine machine) {
        System.out.println("Currently vending machine is in ideal state");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("Click on insert coin button");
    }

    @Override
    public void clickOnStartProductButtonSelection(VendingMachine machine) throws Exception {
        throw new Exception("Product can't be selected before inserting coin");
    }

    @Override
    public void ChooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Click on product selection button");
    }

    @Override
    public void getChange(int amountEnteredByUser, int itemPrice) throws Exception {
        throw new Exception("No coins inserted to receive change");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("No coins inserted to receive refund");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense product in idle state");
    }
}
