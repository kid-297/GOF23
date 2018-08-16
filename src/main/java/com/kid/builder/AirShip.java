package com.kid.builder;

/**
 * 宇宙飞船 实体类
 */
public class AirShip {
    private OrbitalModule orbitalModule;  //轨道舱
    private Engine engine;   //发动机
    private EscapeTower escapeTower;  //逃逸塔


    /**
     * 发动机
     */
    public void launch(){
        System.out.println("我是发动机");
    }

    public AirShip(){

    }
    public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

/**
 * 轨道舱
 */
class OrbitalModule{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrbitalModule(String name) {
        this.name = name;
    }
}

/**
 * 发动机
 */
class Engine{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}

/**
 * 逃逸舱
 */
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}