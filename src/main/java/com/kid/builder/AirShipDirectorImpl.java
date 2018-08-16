package com.kid.builder;

/**
 * 装配者实现
 */
public class AirShipDirectorImpl implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public AirShipDirectorImpl (AirShipBuilder airShipBuilder){
        this.airShipBuilder = airShipBuilder;
    }
    @Override
    public AirShip directAirship() {
        Engine e = airShipBuilder.builderEngine();
        OrbitalModule o =  airShipBuilder.builderOrbitalModule();
        EscapeTower et = airShipBuilder.builderEscapeTower();
        AirShip airShip = new AirShip();
        airShip.setEngine(e);
        airShip.setEscapeTower(et);
        airShip.setOrbitalModule(o);
        return airShip;
    }
}
