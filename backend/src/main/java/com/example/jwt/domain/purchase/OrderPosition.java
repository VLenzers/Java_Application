package com.example.jwt.domain.purchase;

import com.example.jwt.core.generic.ExtendedEntity;

import java.util.UUID;

public class OrderPosition extends ExtendedEntity {

    private UUID productId;
    private int quantity;

    public OrderPosition(){}

    public OrderPosition(UUID id, UUID productId, int quantity) {
        super(id);
        this.productId = productId;
        this.quantity = quantity;
    }

    public UUID getProductId() {
        return productId;
    }

    public OrderPosition setProductId(UUID productId) {
        this.productId = productId;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderPosition setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
}
