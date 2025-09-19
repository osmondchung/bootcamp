package com.bootcamp.demo;

// Java 8: Interface 
public interface Flyable {
  // abstract mehtod
  void fly();

  // after Java 8 - default method in interface
  // concrete method
  default void swim(){
    System.out.println("By default, I am able to swim...");
  }
}
