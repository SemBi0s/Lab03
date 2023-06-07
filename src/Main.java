public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);
        OrderObserver price = new PriceObserver();
        OrderObserver quantity = new QuantityObserver();

        order.attach(price);
        order.attach(quantity);

        Item first = new Item("Trucker cap", 1, 10);
        Item second = new Item("Computer", 1, 10);
        Item third = new Item("Screen", 2, 30);

        System.out.println(order);

        order.addItem(first);
        order.addItem(second);
        order.addItem(third);

        System.out.println(order);



    }
}