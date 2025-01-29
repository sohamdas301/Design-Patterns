package State;

import java.util.List;

public class HasMoneyState implements VendingState {
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
       return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.getCoinList().add(coin);
        System.out.println("Successfully inserted " + coin.value);
    }

    @Override
    public void clickOnStartProductButtonSelection(VendingMachine machine) throws Exception {
        System.out.println("Inserted required amount. Please click to start selecting product");
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void ChooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Click start product button");
    }

    @Override
    public void getChange(int amountEnteredByUser, int itemPrice) throws Exception {
        throw new Exception("Product not selected yet");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new IdleState(machine));
        System.out.println("Refunded all money and back to idle state");
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Can't dispense product in hasMoney state");
    }
}
