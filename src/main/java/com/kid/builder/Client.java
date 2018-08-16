package com.kid.builder;

/**
 * 调用者
 * 建造者模式
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new AirShipDirectorImpl(new AirShipBuilderImpl());
        AirShip airShip = director.directAirship();
        airShip.launch();
    }
}
