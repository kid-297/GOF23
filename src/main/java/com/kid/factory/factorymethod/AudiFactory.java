package com.kid.factory.factorymethod;

/**
 * 奥迪工厂
 */
public class AudiFactory implements CarFactory{
    @Override
    public Car createCar() {
       return new Audi();
    }
}
