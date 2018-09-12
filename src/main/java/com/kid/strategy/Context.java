package com.kid.strategy;

/**
 * 上下文类
 * 负责和具体的策略交互
 */
public class Context {
    private Strategy strategy;  //当前采用算法

    public Context() {
    }

    //可以通过构造器注入
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //可以通过set方法注入
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s){
        System.out.println("您该报价："+strategy.getPrice(s));
    }

}
