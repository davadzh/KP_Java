package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Order {
    private final int _orderId;
    private final Client _client;
    private final int _table;
    private final float _amount;
    private OrderStatus _orderStatus;

    public Order(int orderId, Client client, int table, float amount)
    {
        _orderId = orderId;
        _client = client;
        _table = table;
        _amount = amount;
        _orderStatus = OrderStatus.ACCEPTED;
    }

    public void OrderIssuing()
    {
        System.out.println("Выдача заказа за " + _table + " столик");
        System.out.println("Детали заказа:");
        for (Product product: _client.getOrder()) {
            System.out.println("Номер заказа: " + _orderId);
            System.out.println("Наименование: " + product.getName());
            System.out.println("Цена: " + product.getPrice() + " / " + product.getUnit());
        }
        System.out.println("Итого: " + _client.getOrderAmount() + " руб.");

        _orderStatus = OrderStatus.CLOSED;
    }

    private enum OrderStatus
    {
        ACCEPTED,
        CLOSED
    }
}
