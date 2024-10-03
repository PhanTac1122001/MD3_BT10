package com.example.ss9b4.impl;


import com.example.ss9b4.entity.Product;

public interface IProduct {
    void SaveOrUpdate(Product product);
    void deleteById(int id);
    int findById(int id);
}
