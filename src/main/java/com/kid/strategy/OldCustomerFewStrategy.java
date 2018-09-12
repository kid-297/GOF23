package com.kid.strategy;

/**
 * 老客户小批量
 */
public class OldCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("打8.5折");
        return standarPrice*0.85;
    }
}
