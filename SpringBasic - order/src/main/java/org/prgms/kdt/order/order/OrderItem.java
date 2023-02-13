package org.prgms.kdt.order.order;

import java.util.UUID;

public class OrderItem {
    public final UUID productId; // 상품 아이디
    public final long productPrice; // 상품 가격
    public final int quantity; // 상품 수량

    public OrderItem(UUID productId, long productPrice, int quantity) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}
