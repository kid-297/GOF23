package com.kid.proxy.staticProxy;

/**
 * 静态代理（我们自己定义代理）
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTickect();
        proxy.sing();
        proxy.collectMoney();
    }
}
