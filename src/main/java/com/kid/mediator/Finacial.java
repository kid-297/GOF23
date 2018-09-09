package com.kid.mediator;

/**
 * 财务部
 */
public class Finacial implements Department {
    private Mediator m; //持有中介者（总经理）的引用

    public Finacial(Mediator m) {
        super();
        this.m = m;
        //当前部门注册到中介者中
        m.register("finacial",this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！钱太多了，怎么花！");
    }

    @Override
    public void selfAction() {
        System.out.println("数钱！");
    }
}
