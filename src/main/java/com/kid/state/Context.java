package com.kid.state;

/**
 * 环境类
 */
public class Context {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        state.handle();
    }
}
