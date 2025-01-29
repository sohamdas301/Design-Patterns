package State;

public class Item {
    private String itemName;
    int price;
    int quantity;
    int code;

    public Item(String itemName, int price, int quantity, int code) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
