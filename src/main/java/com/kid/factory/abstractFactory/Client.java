package com.kid.factory.abstractFactory;

/**
 * 调用者
 * 抽象工厂模式
 * 用来生产不同产品族的全部产品（对于增加的新的产品，无能为力；支持增加产品族）
 * 抽象工厂模式是工厂方法模式的升级版本，在由多个业务品种，业务分类时，通过抽象工厂模式需要的对象是一种非常好的解决方式。
 */
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxurCarFactory();
        Engine e = factory.creatEngine();
        e.run();
        e.start();
    }
}
