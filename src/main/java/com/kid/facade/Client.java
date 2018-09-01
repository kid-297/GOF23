package com.kid.facade;

/**
 * 外观模式  调用者
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 使用非外观者模式 泡茶
         */
       /* People huangYaoShi = new People("黄药师");
        TeaSet darkRedEnameledPottery = new DarkRedEnameledPottery();
        darkRedEnameledPottery.useTeaSet();
        Tea puerTea = new PuerTea();
        puerTea.useTea();
        Water boilingWater100 = new BoilingWater100();
        boilingWater100.useWater();
        System.out.println(huangYaoShi.getName()+"自己泡茶");*/
        /**
         * 使用外观者模式泡茶
         */
        MakeTea makeTea = new MakeTea();
        People ouyangfeng = new People("欧阳锋");
        makeTea.make("biluochun",ouyangfeng.getName());
    }


}
