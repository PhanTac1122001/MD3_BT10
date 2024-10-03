package com.example.ss9b3.impl;


import com.example.ss9b3.enity.Product;

public interface IProduct {
    void saveOrUpdate(Product product);
    void deleteById(int id);
    int findById(int id);
}
