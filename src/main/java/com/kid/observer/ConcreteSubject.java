package com.kid.observer;

/**
 * 具体目标对象状态子类
 */
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //目标对象值发生变化，请通知所有观察者
        this.notifyAllObservers();
    }
}
