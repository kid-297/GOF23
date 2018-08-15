package com.kid.factory.abstractFactory;

/**
 * 轮胎
 */
public interface Tyre {
    void revole();
}


class LuxuryTyre implements Tyre{

    @Override
    public void revole() {
        System.out.println("旋转不磨损");
    }
}


class LowTyre implements Tyre{

    @Override
    public void revole() {
        System.out.println("磨损快");
    }
}
