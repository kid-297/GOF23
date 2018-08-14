package com.kid.factory.factorymethod;

/**
 * 调用者
 * 工厂方法者模式（工厂模式）
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactroy().createCar();

        c1.run();
        c2.run();
    }
}
