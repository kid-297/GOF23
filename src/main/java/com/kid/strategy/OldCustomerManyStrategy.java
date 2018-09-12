package com.kid.strategy;

/**
 * 老客户大批量
 */
public class OldCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("打8折");
        return standarPrice*0.8;
    }
}
