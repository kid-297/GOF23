package com.kid.memento;

/**
 * 源发器类
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    //进行备忘操作，并返回备忘录对象
    public EmpMemento memento(){
        return new EmpMemento(this);
    }


    //数据恢复,恢复成指定备忘录值
    public void recovery(EmpMemento memento){
        this.ename = memento.getEname();
        this.age = memento.getAge();
        this.salary = memento.getSalary();

    }
    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
