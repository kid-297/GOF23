package com.kid.factory.abstractFactory;

/**
 * 发动机
 */
public interface Engine {
    void run();
    void start();
}


class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}


class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}