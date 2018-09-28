package com.kid.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题对象（目标对象）
 */
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        list.add(observer);
    }

    public void removeObserver(Observer observer){
        list.remove(observer);
    }

    /**
     * 通知所有观察者更新状态
     */
    public void notifyAllObservers(){
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
