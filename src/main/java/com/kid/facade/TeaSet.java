package com.kid.facade;

/**
 * 茶具接口
 */
public interface TeaSet {
    void useTeaSet();
}

class CoveredTeaSet implements TeaSet{
    @Override
    public void useTeaSet() {
        System.out.println("使用盖碗茶具");
    }
}

class FlowerReceptacle implements  TeaSet{
    @Override
    public void useTeaSet() {
        System.out.println("使用玻璃杯");
    }
}

class DarkRedEnameledPottery implements TeaSet{
    @Override
    public void useTeaSet() {
        System.out.println("使用紫砂壶");
    }
}




