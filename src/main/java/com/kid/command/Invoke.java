package com.kid.command;

/**
 * 命令的调用者/发起者（领导）
 */
public class Invoke {
    private Command command;  //也可以通过同情List<command>容纳横队命令对象，进行批处理

    public Invoke(Command command) {
        this.command = command;
    }

    /**
     * 业务方法，用于调用命令类的方法
     */
    public void call(){
        command.execute();
    }
}
