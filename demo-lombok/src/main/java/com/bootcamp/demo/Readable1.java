package com.bootcamp.demo;

@FunctionalInterface
public interface Readable1 {
  void read();

  // java 8
  // Design Approach
  default void teach(){
    System.out.println("By default teach() method");
  }

  // Java
  static int sum(int x, int y){
    return x + y;
  }
}
