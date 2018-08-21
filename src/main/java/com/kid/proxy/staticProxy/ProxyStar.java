package com.kid.proxy.staticProxy;

/**
 * 代理人
 */
public class ProxyStar implements Star{

    private Star star;
    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTickect() {
        System.out.println("ProxyStar.bookTickect()");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }
}
