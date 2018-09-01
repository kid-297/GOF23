package com.kid.decorator;

/**
 * 抽象组件
 */
public interface ICar {
    void move();
}

/**
 * 具体构件对象
 */
class Car implements ICar{
    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

/**
 * 装饰器角色
 */
class SuperCar implements ICar{
    protected ICar car;
    public SuperCar(ICar car) {
        this.car = car;
    }
    @Override
    public void move() {
       car.move();
    }
}

/**
 * 具体装饰对象
 */
class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
    public void fly(){
        System.out.println("天上飞");
    }
}

/**
 * 具体装饰对象
 */
class WaterCar extends SuperCar {
    public WaterCar(ICar car) {
        super(car);
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
    public void swim(){
        System.out.println("水上游");
    }
}

class AICar extends SuperCar {
    public AICar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }

    public void autoMove(){
        System.out.println("自动跑");
    }
}


