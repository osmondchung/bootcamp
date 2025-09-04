public class ErrorTest2 {
    public static void main(String[] args) {
    try{
      int[] arr = new int[3];
      System.out.println(arr[4]);
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("The returned exception is well received.");
        System.out.println("the root cause is " + e.getMessage());
    }
    System.out.println("The end of program");


  }

}
