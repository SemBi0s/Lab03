public class Item {
    private final String name;
    private final int quantity;
    private final double price;
    Item(String name, int quantity,double price ){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
