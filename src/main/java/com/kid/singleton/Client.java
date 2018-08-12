package com.kid.singleton;

public class Client {

    public static void main(String[] args) {
        //使用饿汉式模式测试单例
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
