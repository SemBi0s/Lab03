public class QuantityObserver implements OrderObserver{

    private boolean security = true;
    @Override
    public void update(Order order) {
        if (order.getQuantity()>5 && security){
            order.applyDiscount(10);
            security = false;
        }
    }
}
