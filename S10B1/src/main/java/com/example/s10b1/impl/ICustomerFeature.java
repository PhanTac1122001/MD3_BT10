package com.example.s10b1.impl;


import com.example.s10b1.entity.Customer;

public interface ICustomerFeature {
    void saveOrUpdate(Customer customer);
    void deleteById(int customerId);
    int findById(int customerId);
}
