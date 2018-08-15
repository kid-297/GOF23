package com.kid.factory.abstractFactory;

/**
 * 汽车工厂
 * 抽象工厂模式
 */
public interface CarFactory {
    Engine creatEngine();
    Seat creatSeat();
    Tyre creatTyre();
}
