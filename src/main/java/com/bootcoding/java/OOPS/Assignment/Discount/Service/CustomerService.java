package com.bootcoding.java.OOPS.Assignment.Discount.Service;

import com.bootcoding.java.OOPS.Assignment.Discount.Customer;
import com.bootcoding.java.OOPS.Assignment.Discount.NameGenrater;
import com.bootcoding.java.OOPS.Assignment.Discount.OrderCountGenrater;
import com.bootcoding.java.OOPS.Assignment.Discount.VisitCountGenareter;

import java.util.UUID;

public class CustomerService {

    private  static final int LIMIT =100;
    public  Customer[] getAllCustomer(){
        Customer[] customers = new Customer[LIMIT];
        for (int i = 0; i <LIMIT ; i++) {
            Customer customer = buildCustomer();
            customers[0] = customer;

        }
        return customers;

    }

    private  Customer buildCustomer(){
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setName(NameGenrater.getname());
        customer.setOrderCount(OrderCountGenrater.getOrderCount());
        customer.setVisitCount(VisitCountGenareter.getVisitCount());

        return customer;
    }
}
