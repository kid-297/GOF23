package com.kid.command;

/**
 * 抽象命令类
 */
public interface Command {
    /**
     * 这个方法时一个返回结果为空的方法
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

/**
 * 具体命令类
 */
class ConcreteCommand implements Command{

    private Receiver receiver; //命令的正在执行者

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令执行前或后，执行相关的处理
        receiver.action();
    }
}
