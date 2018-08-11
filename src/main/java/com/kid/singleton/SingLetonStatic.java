package com.kid.singleton;
/**
 * 静态内部类式
 * 线程安全、调用率高、可以延时加载
 */
public class SingLetonStatic {
    //定义静态内部类
    private static class SingletonClassInstance{
        private static final SingLetonStatic singLetonStatic = new SingLetonStatic();
    }

    private SingLetonStatic(){

    }

    public static SingLetonStatic getInstance(){
        return SingletonClassInstance.singLetonStatic;
    }
}
