public class ErrorTest {
  public static void main(String[] args) {
    try{
      int count = 0;
      int num = 100;
      System.out.println(div(num, count));
    } catch(ArithmeticException e) {
        System.out.println("The returned exception is well received.");
        System.out.println("the root cause is " + e.getMessage());
    }
    System.out.println("The end of program");


  }
  public static int div(int num, int count){
    if (count == 0){
      throw new ArithmeticException("The number cannot be divided by ZERO");
    }
    return num / count;
  }
}
