package com.kid.singleton;

/**
 * 双重检索锁式
 * 这个模式将同步内容下放到if内部，提高了执行的效率，
 * 不必每次获取对象时都进行同步，只有第一次才需要同步，
 * 创建了以后就没必要了（不推荐使用）
 * */
public class SingletonDemo3 {
    private static SingletonDemo3 instance = null;

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (SingletonDemo3.class) {
                        if(sc == null) {
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private SingletonDemo3() {

    }
}
