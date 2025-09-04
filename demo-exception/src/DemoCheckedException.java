// Unchecked -> Compile time -> allow exists
// Checked Exception -> Compile time -> handle/fix
public class DemoCheckedException {
  public static void main(String[] args) {
    try {
      System.out.println(total(new int[0]));
      total(null);    //java.lang.NullPointerException
    } catch (InvalidParameterException e) {
    }
  }

  // RuntimeException (IllegalArgumentException) 
  // 1. Method caller can ignore RuntimeException. (By try-catch)
  // 2. Method author no need to add Exception into method signature
  
  // Exception (InvalidParameterException)
  // 1. method caller has to try-catch
  // 2. method author need to add Exception into method signature
  public static int total(int[] arr) throws InvalidParameterException{
    if (arr == null)
      throw new InvalidParameterException("Array is null"); // RuntimeException (Unchecked Exception)
    int total = 0;
    for (int x : arr){
      total += x;
    }
    return total;
  }
}

