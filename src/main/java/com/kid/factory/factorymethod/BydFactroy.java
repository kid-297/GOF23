package com.kid.factory.factorymethod;

/**
 * 比亚迪工厂
 */
public class BydFactroy implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }
}
