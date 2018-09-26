package com.kid.state;

/**
 * 已入住
 */
public class CheckedInState implements State{
    @Override
    public void handle() {
        System.out.println("房间已入住");
    }
}
