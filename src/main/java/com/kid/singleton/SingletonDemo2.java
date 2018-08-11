package com.kid.singleton;

/**
 * 懒汉模式(延迟加载/懒加载)
 */
public class SingletonDemo2 {
    //1.实现私有的构造器，别人不可调用
    private SingletonDemo2(){}
    //2.实现一个私有的对象。 类初始化时，不初始化这个对象！真正用的时候创建
    private static SingletonDemo2 instance;
    //3.提供一个开放方法。 方法同步，调用效率低
    public static synchronized SingletonDemo2 getInstance(){
        if(instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
