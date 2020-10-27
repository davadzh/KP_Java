package com.company;

public class Product {
    private final String _name;
    private final float _price;
    private final String _unit;
    private final String _quantityPerUnit;
    private final String[] _composition;

    public Product(String name,
                   float price,
                   String unit,
                   String quantityPerUnit,
                   String[] composition)
    {
        _name = name;
        _price = price;
        _unit = unit;
        _quantityPerUnit = quantityPerUnit;
        _composition = composition;
    }

    public String getName()
    {
        return _name;
    }

    public float getPrice()
    {
        return _price;
    }

    public String getUnit()
    {
        return _unit;
    }

    public String getQuantityPerUnit()
    {
        return _quantityPerUnit;
    }

    public String[] getComposition()
    {
        return _composition;
    }
}
