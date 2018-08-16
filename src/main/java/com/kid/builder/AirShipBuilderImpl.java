package com.kid.builder;

/**
 * 构建者实现类
 */
public class AirShipBuilderImpl implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("我是发动机");
        return new Engine("发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("我是轨道舱");
        return new OrbitalModule("轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("我是逃逸舱");
        return new EscapeTower("逃逸舱");
    }
}
