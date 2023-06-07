import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    private int id;

    private double discount;

    public Order(int id){
        this.id = id;
        this.discount = 0;
    }

    public void attach(OrderObserver observer) {
        this.observers.add(observer);
    }
    public void detach(OrderObserver observer) {
        this.observers.remove(observer);
    }

    public void applyDiscount(double discount){
        this.discount += discount;
    }

    public void addItem(Item item) {
        items.add(item);
        for(OrderObserver o : observers){
            o.update(this);
        }
    }
    public double getTotalPrice() {
        double temp = 0;
        for (Item i : items ){
            temp += i.getPrice() * i.getQuantity();
        }
        temp += 10 ;
        temp -= discount;

        return temp;
    }
    public int getQuantity() {
        int temp = 0;
        for (Item i : items ){
            temp += i.getQuantity();
        }
        return temp;
    }
    @Override
    public String toString(){

        StringBuilder ordertext = new StringBuilder("Order : " + id + '\n');

        for (Item i : items){
            ordertext.append("Name : ").append(i.getName()).append('\n');
            ordertext.append("Price : ").append(i.getPrice() * i.getQuantity()).append('\n');
            ordertext.append("Quantity : ").append(i.getQuantity()).append('\n');
        }

        ordertext.append("Discount = ").append(this.discount).append('\n');

        ordertext.append("Total Quantity = ").append(this.getQuantity()).append('\n');

        ordertext.append("Total Price = ").append(this.getTotalPrice()).append('\n');

        return  ordertext.toString();

    }
}

