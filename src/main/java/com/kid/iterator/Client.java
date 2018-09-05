package com.kid.iterator;

/**
 * 迭代器模式
 */
public class Client {
    public static void main(String[] args) {
        ConcrtetMyAggregate cma = new ConcrtetMyAggregate();
        cma.addObject("aa");
        cma.addObject("bb");
        cma.addObject("cc");

        MyIterator iterator = cma.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj());
            iterator.next();
        }
    }
}
