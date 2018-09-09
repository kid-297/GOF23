package com.kid.mediator;

/**
 * 研发部
 */
public class Development implements Department {
    private Mediator m; //持有中介者（总经理）的引用

    public Development(Mediator m) {
        super();
        this.m = m;
        //当前部门注册到中介者中
        m.register("development",this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，开发项目！");
    }
}
