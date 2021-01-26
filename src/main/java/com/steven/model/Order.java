package com.steven.model;

import java.util.*;

public class Order {

    private final Map<String, Integer> orderMap = new HashMap<>();

    public Map<String, Integer> mapOrder(List<OrderItem> orders) {
        orders.stream().forEach(order -> orderMap.put(order.getType(), order.getTarget()));
        return orderMap;
    }
}
