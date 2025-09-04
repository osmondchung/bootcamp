public class DemoRuntimeException {
  public static void main(String[] args) {
    
    // avoidable exception (bug)
    // 1. NPE (Null Pointer Exception)
    String s = null;
    //System.out.println(s.length());
    
    // 2. ArrayOutBoundOfIndex
    int[] arr = new int[3];
    //System.out.println(arr[3]); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    // 3. ArithemticException 
    int count = 0;
    //int average = 10 / count; // ava.lang.ArithmeticException: / by zero

    // 4. StringIndexOutOfBoundsException
    //System.out.println("hello".charAt(5)); // java.lang.StringIndexOutOfBoundsException
    
    // unavoidable exception
    // 5. Method throw exception
    String input = null;
    //getLength(input); // IllegalArgumentException
    // Solution for method caller:
    // Solution 1. : try-catch IllegalArgumentException
    // Solution 2. : if input != null

    // 6. Type Conversion (i.e. String to Integer)
    String number = "3!";
    //System.out.println(Integer.valueOf(number)); // java.lang.NumberFormatException: For input string
    // Solution for method caller
    // 1. try-catch NumberFormatException

    // 7. Login (i.e. database) 
    // username or password is wrong -> IOException
    
    // 8. Find a specific file name in a folder
    // FileNotFoundException
  }

  public static int getLength(String s){
    if (s != null)
      return s.length();
    throw new IllegalArgumentException("s should not be null.");
  }
}
