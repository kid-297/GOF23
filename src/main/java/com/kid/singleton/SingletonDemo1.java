package com.kid.singleton;

/**
 * 饿汉式单例模式
 */
public class SingletonDemo1 {
    //1.实现私有的构造器，别人不可调用
    private SingletonDemo1(){}
    //2.实现一个私有的对象。 类初始化时，立即加载这个对象！由于加载类时，天然的是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();
    //3.提供一个开放方法。 方法没有同步，调用效率高
    public static SingletonDemo1  getInstance(){
        return instance;
    }
}
