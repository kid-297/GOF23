package com.kid.strategy;

/**
 * 普通客户大批量
 */
public class NewCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("打9折");
        return standarPrice*0.9;
    }
}
