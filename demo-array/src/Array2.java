import java.util.Arrays;

public class Array2 {
  public static void main(String[] args){
    // loop array
    long[] arr = new long[4];
    arr[0] = 10; // auto-promotion, upcast (int to long)
    arr[1] = 100L;
    arr[2] = -9;
    arr[3] = 0;
    
    // loop and print
    //for (int i = 0; i < arr.length; i++){
    //  System.out.println(arr[i]);
    //}

    // + 1 to all elements by loop
    /*for (int i = 0; i < arr.length; i++){
      arr[i] += 1; // long + int put into long type variable
      //System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr)); // array to string to print */

    // 11 + 101 ->  112
    long[] arr2 = {11, 101, -8, 1};
    
    for (int i = 0; i < arr2.length; i++){
      if (i != arr2.length - 1){
        arr2[i] = arr2[i] + arr2[i + 1];
      }
    }
    System.out.println(Arrays.toString(arr2));

    // String array
    String[] names = {"Yanny", "Peter", "Cedric" };
    String targetStr = "e";
    int counter = 0;
    for (int i = 0; i < names.length; i++){
      if (names[i].contains(targetStr)){
        counter++;
        System.out.println(names[i]);
      }
    }
    System.out.println(counter);
    //System.out.println(Arrays.toString(names));

    // put String's length into another array
    int[] namesLength = new int[names.length];
    for (int i = 0; i < names.length; i++){
      namesLength[i] = names[i].length();
    }
    System.out.println(Arrays.toString(namesLength));

    // String
    String word = "-10"; // lelel -> true, lellel -> true
    boolean isPalindrome = false;
    for (int i = 0; i < word.length(); i++){
        if (word.charAt(i) == word.charAt(word.length() - (i + 1))){
          isPalindrome = true;
        } else {
          isPalindrome = false;
          break;
        }
      }
    System.out.println(isPalindrome); 

    // declare array
    //
    int[] ages = new int[4];
    arr[0] = 10; // auto-promotion, upcast (int to long)
    arr[1] = 100L;
    arr[2] = -9;
    arr[3] = 0;

    int[] ages2 = new int[] {31, 9, 4}; // you know the numbers at the beginning
    System.out.println(Arrays.toString(ages2));

    

  }
}
