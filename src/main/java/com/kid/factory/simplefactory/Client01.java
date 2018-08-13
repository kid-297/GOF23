package com.kid.factory.simplefactory;

/**
 * 调用者
 * 使用普通方法调用比亚迪和奥迪类
 * 结果：
 * 奥迪在跑
 * 比亚迪再跑
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();

    }
}
