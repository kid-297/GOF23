package com.kid.prototype;

import java.util.Date;

/**
 * 测试原型模式(浅克隆)
 * 克隆分（深克隆和浅克隆）
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(234234234234L);
        Sheep s1 = new Sheep("小羊",date);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
        date.setTime(123123132L);
        System.out.println(s1.getBirthday());

        s2.setSname("大羊");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
