package com.kid.prototype;

import java.io.*;
import java.util.Date;

/**
 * 使用序列化和反序列化的方式实现深复制
 */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(234234234234L);
        Sheep s1 = new Sheep("小羊",date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());


        //使用序列化和反序列化的方式实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();

        date.setTime(123123132L);
        System.out.println(s1.getBirthday());

        s2.setSname("大羊");
        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }
}
