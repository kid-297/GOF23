package com.kid.observer;

/**
 * 具体的观察者
 */
public class ObserverA implements Observer{

    private int myState; // 需要和目标对象状态保持一致
    @Override
    public void update(Subject sub) {
        myState = ((ConcreteSubject)sub).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
