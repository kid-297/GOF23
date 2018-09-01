package com.kid.facade;

/**
 * 水接口
 */
public interface Water {
    void useWater();
}

class BoilingWater80 implements Water{
    @Override
    public void useWater() {
        System.out.println("使用80度开水");
    }
}

class BoilingWater90 implements Water{
    @Override
    public void useWater() {
        System.out.println("使用90度开水");
    }
}

class BoilingWater100 implements Water{
    @Override
    public void useWater() {
        System.out.println("使用100度开水");
    }
}