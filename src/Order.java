import jdk.jfr.EventType;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Order {
    private Map<EventType, Vector<OrderObserver>> observerList = new HashMap<>();

    public void attach(OrderObserver observer) {
    }
    public void detach(OrderObserver observer) {
    }
}

