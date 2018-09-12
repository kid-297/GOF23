package com.kid.strategy;

import com.kid.iterator.ConcrtetMyAggregate;

/**
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {
        //老客户
        Strategy s1 = new OldCustomerManyStrategy();
        Context context = new Context(s1);

        context.printPrice(998);
    }
}
