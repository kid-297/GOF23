package com.kid.bridge;

/**
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {
        //销售联想笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();
    }
}
