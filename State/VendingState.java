package State;

import java.util.List;

public interface VendingState {
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception;
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception;
    public void clickOnStartProductButtonSelection(VendingMachine machine) throws Exception;
    public void ChooseProduct(VendingMachine machine, int codeNumber) throws Exception;
    public void getChange(int amountEnteredByUser, int itemPrice) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;
}
