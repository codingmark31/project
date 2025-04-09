package com.alan;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello World");
        Person p=new Person();
        Dice d=new Dice();

     p.hello();
        p.age=20;
        p.name="Alan";
        p.weight=50;
        p.height = 1.6f;
        p.print();
        System.out.println("bmi="+p.bmi());
        p.age=17;
        p.name="mary";
        p.weight=40;
        p.height = 1.5f;
        p.print();
        System.out.println("bmi="+p.bmi());
        System.out.println("max="+d.max);
        System.out.println("max="+d.point);
        //new Person().hello();
    }
}