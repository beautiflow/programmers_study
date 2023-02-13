package org.prgms.kdt.order.order;

import org.prgms.kdt.order.voucher.Voucher;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class Order {
    private final UUID orderId;  // 식별자. long 타입 많이 쓰지만 UUID 로 만듦
    private final UUID customerId;
    private final List<OrderItem> orderItems; // 주문 목록
    private Optional<Voucher> voucher;  // voucher 라는 인터페이스를 전달받도록
    private OrderStatus orderStatus = OrderStatus.ACCEPTED;

    public Order(UUID orderId, UUID customerId, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderItems = orderItems;
        this.voucher = Optional.empty(); // voucher 없을 경우
    }

    public Order(UUID orderId, UUID customerId, List<OrderItem> orderItems, Voucher voucher) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderItems = orderItems;
        this.voucher = Optional.of(voucher); // voucher 있을 경우
    }

    public long totalAmount() {
        var beforeDiscount = orderItems.stream()
                .map(v -> v.getProductPrice() * v.getQuantity()) // 항목들을 가져와서 순회하면서 수량을 곱해주고
                .reduce(0L, Long::sum);
        return voucher.map(value -> value.discount(beforeDiscount)).orElse(beforeDiscount); // voucher 가 존재하면 할인, 그렇지 않으면 할인하지 않음
    }

    public UUID getOrderId() { return this.orderId; }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Optional<Voucher> getVoucher() {
        return voucher;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
