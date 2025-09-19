package com.bootcamp.demo;

// Day 2 
// Design Approach 1: include teach() method into readable1 interface
// Design Approach 2: create a new interface Teachable(), let etacher to implement
public class Teacher implements Readable1{
  @Override
  public void read(){
    System.out.println("Teachre is reading...");
  }
}
