package com.kid.prototype;

import java.util.Date;

/**
 * 原型模式（深克隆）
 *
 */
public class Client2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(234234234234L);
        Sheep2 s1 = new Sheep2("小羊",date);
        Sheep2 s2 = (Sheep2) s1.clone();
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
