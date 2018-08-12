package com.kid.singleton;
/**
 * 静态内部类式（也是一种懒加载方式）
 * 线程安全、调用率高、可以延时加载
 */
public class SingLetonDemo4{
    //定义静态内部类
    private static class SingletonClassInstance{
        private static final SingLetonDemo4 instance = new SingLetonDemo4();
    }

    private SingLetonDemo4(){

    }

    public static SingLetonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }
}
