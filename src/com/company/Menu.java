package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Product> _products;
    private ArrayList<Product> _stopList = new ArrayList<>();
    private String _inStoplist = "inStopList";

    public Menu(ArrayList<Product> products)
    {
        _products = products;
    }

    public void addProduct(Product newProduct)
    {
        _products.add(newProduct);
    }

    public void removeProduct(String name)
    {
        var product = getProductByName(name);
        if (product != null)
            _products.remove(product);
        else
            System.out.println("Такого товара нет в меню.");
    }

    public void addInStopList(String name)
    {
        var product = getProductByName(name);
        if (product != null)
            _stopList.add(getProductByName(name));
        else
            System.out.println("Такого товара нет в меню. Невозможно добавить в стоп-лист.");
    }

    private Product getProductByName(String name)
    {
        for (Product product: _products) {
            if (product.getName().equals(name))
                if (!_stopList.contains(product))
                    return product;

        }
        return null;
    }

    public Product getProductForClient(String name)
    {
        for (Product product: _products) {
            if (product.getName().equals(name))
            {
                if (!_stopList.contains(product))
                    return product;
                else
                    System.out.println("К сожалению, товар закончился");
                    return null;
            }
        }
        System.out.println("Такого товара нет у нас в меню");
        return null;
    }
}
