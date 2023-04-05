package com.bootcoding.java.OOPS.Assignment.Discount.Service;

import com.bootcoding.java.OOPS.Assignment.Discount.Customer;
import com.bootcoding.java.OOPS.Assignment.Discount.Discount;

public class DiscountService {
    Customer customer = new Customer();
    private final static int LIMIT =100;
    public Discount [] getAllCustomerDiscount(){
        Discount[] discounts = new Discount[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            Discount discount = builDiscount();
            discounts[i]=discount;
            
        }
        return discounts;
        
    }

    private Discount builDiscount() {

        int visitCount= customer.getVisitCount();
        int orderCount = customer.getOrderCount();
        String Name = customer.getName();

        int discountInPercentage = calculateDiscount(visitCount, orderCount);
        Discount discount = new Discount();
        discount.setCustomerName(Name);
        discount.setDiscount(discountInPercentage);
        return discount;




    }

    private int calculateDiscount(int visitCount, int orderCount) {
        int totalCount = visitCount+orderCount;

        if(totalCount>=1000){
            return 50;

        }
        if(totalCount>=750){
            return 40;
        }
        if (totalCount>=500){
            return 30;
        }
        if (totalCount>=250){
            return 20;
        }
        if (totalCount>=100){
            return 10;
        }
        return 0;
    }
}
