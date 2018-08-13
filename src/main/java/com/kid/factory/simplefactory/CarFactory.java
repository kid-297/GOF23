package com.kid.factory.simplefactory;
/**
 * 调用者
 * 简单工厂类
 * 缺点：不完全满足OCP
 */
public class CarFactory {
    public static Car getCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        }else if ("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}
