package com.kid.adapter;

/**
 * 适配器本身
 * （相当于user和ps/2转接器）
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    @Override
    public void handleRequest() {
        adaptee.request();
    }

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }
}
