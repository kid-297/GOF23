package com.kid.state;

/**
 * 已预定
 */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("房间已预定");
    }
}
