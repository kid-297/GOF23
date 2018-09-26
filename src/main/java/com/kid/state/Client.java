package com.kid.state;

/**
 * 状态模式
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new FreeState());
    }
}
