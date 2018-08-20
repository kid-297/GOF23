package com.kid.adapter;

/**
 * 客户端类
 * （相当于例子中的笔记本，只有USB接口）
 */
public class Client {

    public  void test1 (Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();

        Adaptee a  = new Adaptee();

        Target t = new Adapter(a);

        t.handleRequest();
    }
}
