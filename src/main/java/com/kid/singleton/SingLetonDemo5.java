package com.kid.singleton;
/**
 * 枚举
 * 线程安全、调用率高、不能延时加载
 */
public enum  SingLetonDemo5 {

    //这个枚举元素，本身就是单例对象
    INSTANCE;

    public void SingLetonDemo5(){

    }
}
