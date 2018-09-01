package com.kid.facade;

/**
 * 泡茶流程的门面对象
 */
public class MakeTea {
    public  void  make(String teaName,String username){
        TeaSet teaSet = null;
        Tea tea = null;
        Water water = null;
        switch (teaName){
            case "puer":
                teaSet = new DarkRedEnameledPottery();
                teaSet.useTeaSet();
                tea = new PuerTea();
                tea.useTea();
                water = new BoilingWater100();
                water.useWater();
                System.out.println("为"+username+"泡茶");
                break;
            case "biluochun":
                teaSet = new CoveredTeaSet();
                teaSet.useTeaSet();
                tea = new BiluochunTea();
                tea.useTea();
                water = new BoilingWater80();
                water.useWater();
                System.out.println("为"+username+"泡茶");
                break;
            case  "jasmine":
                teaSet = new FlowerReceptacle();
                teaSet.useTeaSet();
                tea = new JasmineTea();
                tea.useTea();
                water = new BoilingWater90();
                water.useWater();
                System.out.println("为"+username+"泡茶");
                break;
                default:
                    this.make("jasmine",username);
                    break;
        }

    }
}
