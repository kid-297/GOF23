package com.kid.memento;

/**
 * 备忘录模式
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();

        Emp emp = new Emp("kid",18,900);

        System.out.println("第一次打印对象："+emp.getEname()+"===="+emp.getAge()+"==="+emp.getSalary());

        //备忘一次
        taker.setMemento(emp.memento());

        emp.setAge(28);
        emp.setEname("六六");
        emp.setSalary(2910);

        System.out.println("第二次打印对象："+emp.getEname()+"===="+emp.getAge()+"==="+emp.getSalary());

        //恢复到备忘录对象保存的状态
        emp.recovery(taker.getMemento());
        System.out.println("第三次打印对象："+emp.getEname()+"===="+emp.getAge()+"==="+emp.getSalary());


    }
}
