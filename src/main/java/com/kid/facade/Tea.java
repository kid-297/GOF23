package com.kid.facade;

/**
 * 茶叶
 */
public interface Tea {
    void useTea();
}

class BiluochunTea implements Tea{
    @Override
    public void useTea() {
        System.out.println("使用碧螺春");
    }
}

class JasmineTea implements Tea{
    @Override
    public void useTea() {
        System.out.println("使用茉莉花茶");
    }
}

class PuerTea implements Tea{
    @Override
    public void useTea() {
        System.out.println("使用普洱");
    }
}