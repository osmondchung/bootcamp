package com.bootcamp.demo;

public class Superman implements Flyable{
  // u hv to verride fly() method
  @Override
  public void fly(){
    System.out.println("superman is flying....");
  }

  // Optional to override swim() method, coz swim() is a default method
  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.swim();
    s1.fly();

    Flyable s2 = new Superman();
    s2.swim(); // Flyable -> swim()
    s2.fly();
  }
}
