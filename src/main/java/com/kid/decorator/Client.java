package com.kid.decorator;

/**
 *装饰器模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=============汽车功能============");
        Car car = new Car();
        car.move();

        System.out.println("=============增加功能，飞行============");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("=============增加功能，水里游============");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("=============增加功能，飞行，水里游，自动跑============");
        AICar aiCar = new AICar(new WaterCar( new FlyCar(car)));
        aiCar.move();
    }
}
