package com.alan;
public class Person {
    String name;
    int age;
    float weight;
    float height;
    public double bmi() {
        double  bmi = weight / (height*height);
        return bmi;
    }
   public void hello(){
       System.out.println("hello");

   }
   public void print(){
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("weight="+weight);
        System.out.println("height="+height);
    }

}
