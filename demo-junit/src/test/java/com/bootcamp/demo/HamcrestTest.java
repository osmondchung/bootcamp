package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

// TestFile = test Environment
public class HamcrestTest {
  // Test List
  @Test
  void testCalculator(){
    String actualResult = "hello";
    // junit 5
    assertEquals("hello", actualResult);
    // Hamcrest (aligns English Grammer)
    assertThat(actualResult, is(equalTo("hello")));

    Calculator c1 = new Calculator();
    assertThat(c1.sum(10,4), is(equalTo(14)));

    
  }
}
