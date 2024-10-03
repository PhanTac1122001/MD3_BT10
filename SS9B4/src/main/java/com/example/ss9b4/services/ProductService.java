package com.example.ss9b4.services;

import com.example.ss9b4.entity.Product;
import com.example.ss9b4.impl.IProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProduct {
    public static List<Product> products = new ArrayList<>();

    @Override
    public void SaveOrUpdate(Product product) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public int findById(int id) {
        return 0;
    }
}
