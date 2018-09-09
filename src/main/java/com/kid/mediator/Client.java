package com.kid.mediator;

import com.kid.facade.MakeTea;

import java.util.Map;

/**
 * 中介者模式
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development department = new Development(m);
        Finacial finacial = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
