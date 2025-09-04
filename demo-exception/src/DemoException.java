
public class DemoException {
  public static void main(String[] args) throws Exception {
    //int result =  methodA("lucas chan", "steven wong");

    // try to call methodA
    try {
      int result = methodA(null, "steven wong");
          System.out.println("result=" + result);
    } catch(RuntimeException e) { 
      // 1. handle reason of death, e is the exception object
      // 2. Recovery
      System.out.println("The returned exception is well received.");
      System.out.println("the root cause is " + e.getMessage());
    }
    // happy flow : line 8,9
    // Exception flow: line 8, 10, 11, 12
    System.out.println("The end of program.");
  }

  // method -> either return or flow
  // for "throw", it is throwing an exception object
  public static int methodA(String s1, String s2){
    if (s1 == null || s2 == null)
      throw new RuntimeException("s1 and s2 should not be null."); // reason of death
    // business logic (happy flow)
    if (s1.length() > s2.length()){
        return methodB(s1);
    } else {
        return methodB(s2);
    }
  }

  public static int methodB(String x){
    if (x.length() > 3){
        return "hello".length();
    } else {
        return "goodbye".length();
    }
  }
}
