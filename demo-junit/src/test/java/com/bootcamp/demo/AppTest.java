package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

  // "mvn clean test" -> execute @Test methods
  // if any assertions fail, thats mean test case fail
  @Test
  void testSum(){
    //int actualResult = App.sum(3,4);
    Assertions.assertEquals(7, App.sum(3,4));
    Assertions.assertEquals(8, App.sum(9,-1));

  }
  @Test
  void testgetLength(){
    Assertions.assertEquals(5, App.getLength("hello"));
    Assertions.assertEquals(0, App.getLength(null));
  }

  
}
