public class PriceObserver implements OrderObserver{

    private boolean security = true;
    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200 && security){
            order.applyDiscount(10);
            security = false;
        }
    }
}
