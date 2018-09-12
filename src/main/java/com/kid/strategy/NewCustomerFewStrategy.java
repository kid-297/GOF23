package com.kid.strategy;

/**
 * 普通客户小批量
 */
public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standarPrice) {
        System.out.println("不打折，原价");
        return standarPrice;
    }
}
