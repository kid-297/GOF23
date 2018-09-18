package com.kid.templateMethod;

public abstract class BankTeplateMethod {
    public void takeNumber(){
        System.out.println("排队取号");
    }

    public  abstract void transact();  //办理具体的业务  //钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }

    /**
     * 模板方法
     */
    public final void process(){
        this.takeNumber();

        this.transact();

        this.evaluate();
    }
}
