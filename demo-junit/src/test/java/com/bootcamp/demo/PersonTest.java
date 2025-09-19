package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
  @Test
  void testPerson(){
    Person p1 = new Person("john", 13);
    Assertions.assertEquals("john", p1.getName());

    Person p2 = new Person("john",13);
    Assertions.assertEquals(true, p1.hashCode() == p2.hashCode());
    Assertions.assertEquals(true, p1.equals(p2));

    p1.setAge(20);
    Assertions.assertEquals(20, p1.getAge());
  }
}
