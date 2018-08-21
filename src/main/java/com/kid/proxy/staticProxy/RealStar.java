package com.kid.proxy.staticProxy;

/**
 *真实角色
 */
public class RealStar implements Star{
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTickect() {
        System.out.println("RealStar.bookTickect()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar（周杰伦本人）.sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
