package com.bootcamp.demo;

// static import: copy all static method from Mocito into StudentTest class
// After static import, you no longer need to use static Mockito call.
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// Student depends on Calculator
@ExtendWith(MockitoExtension.class) // !!!!!!!!!!!!!!!
public class StudentTest {
  @Mock
  private MathOperation mathOperation;

  @InjectMocks
  private Student student;

  // assertEquals: usually for raw types only: primitives, wrapper class, string
  
  @Test
  void testStudent(){
    Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
    Mockito.when(mathOperation.operate(2, 6)).thenReturn(100);
    // Strat Testing
    int actualResult = s1.operate(2,3);
    Assertions.assertEquals(300, actualResult);

    verify(mathOperation, times(1)).operate(2,6);

  }
  @Test
  void testStudent2(){
    Student s2 = new Student("Mary", mathOperation);
    // test getter, setter

    // Assumption
    Mockito.when(mathOperation.operate(3, 4)).thenReturn(10);
    // Strat Testing
    int actualResult2 = s2.operate(3,2);
    Assertions.assertEquals(30, actualResult2);

    verify(mathOperation, times(1)).operate(3,4);

  }
}
