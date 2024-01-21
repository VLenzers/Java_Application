package com.example.jwt.domain.purchase.dto;

import java.util.UUID;

public class OrderPositionDTO {

    private UUID productId;
    private int quantity;

    public OrderPositionDTO(UUID productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public OrderPositionDTO setProductId(UUID productId) {
        this.productId = productId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderPositionDTO setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
