package org.prgms.kdt.order.order;

import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class MemoryOrderRepository implements OrderRepository {

    private final Map<UUID, Order> storage = new ConcurrentHashMap<>();

    @Override
    public Order insert(Order order) { // void 가 아니라 Order 가 리턴 되도록
        storage.put(order.getOrderId(), order);
        return order;
    }
}
