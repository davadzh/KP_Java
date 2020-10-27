package com.company;

import java.util.ArrayList;

public class Client {
    private Menu _menu;
    private ArrayList<Product> _order = new ArrayList<>();

    public Client(Menu menu)
    {
        _menu = menu;
    }

    public void addProductInOrder(String name)
    {
        Product product = _menu.getProductForClient(name);
        if (product != null)
            _order.add(product);
    }

    public ArrayList<Product> getOrder()
    {
        return _order;
    }

    public float getOrderAmount()
    {
        float amount = 0;
        for (Product product: _order) {
            amount += product.getPrice();
        }
        return amount;
    }
}
