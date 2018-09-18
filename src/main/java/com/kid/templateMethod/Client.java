package com.kid.templateMethod;

/**
 * 模板方法
 */
public class Client {
    public static void main(String[] args) {
        BankTeplateMethod btm = new DrawMoney();

        btm.process();

        //采用匿名内部类
        BankTeplateMethod btm2 = new BankTeplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱！！！");
            }
        };
        btm2.process();
    }
}

/**
 * 取款业务
 */
class DrawMoney extends BankTeplateMethod{

    @Override
    public void transact() {
        System.out.println("我要取款!!!");
    }
}