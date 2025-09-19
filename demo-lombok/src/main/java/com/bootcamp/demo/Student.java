package com.bootcamp.demo;

public class Student implements Readable1{
  @Override
  public void read(){
    System.out.println("student is reading");
  }

  public static void main(String[] args) {
    System.out.println(Readable1.sum(3,4));
  }
}
