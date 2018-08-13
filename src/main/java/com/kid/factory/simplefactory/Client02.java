package com.kid.factory.simplefactory;

/**
 * 简单工厂模式
 *  使用简单方法调用比亚迪和奥迪类
 *  结果：
 *  奥迪在跑
 *  比亚迪再跑
 */
public class Client02 {
    public static void main(String[] args) {
        Car c1 = CarFactory.getCar("奥迪");
        Car c2 = CarFactory.getCar("比亚迪");

        c1.run();
        c2.run();

    }
}
