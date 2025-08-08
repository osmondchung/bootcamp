import java.util.Arrays;

public class Array1 {
  public static void main(String[] args){
    // Problem: store or read a series of same type of data

    // Array
    // Data structure -- read and write data in a location (array)

    // Create array
    // Step 1.
    int[] arr = new int[4]; // created 4 spaces for int numbers

    //Step 2. palce numbers into array
    arr[0] = 8;
    arr[1] = 1;
    arr[2] = 10;
    arr[3] = 50;
    System.out.println(arr.length); //4 // no need ()

    // print all element in array
    System.out.println(arr); //[I@6d06d69c (object reference)
    System.out.println(Arrays.toString(arr)); // [8, 1, 10, 50]

    // double array, length 6
    // double[] arr2 = new double[6];
    double[] arr2 = {3.3, 3.4, 100.9, 99.9, 1000.9, -999.999};

    // string array, length of 5
    String[] arr3 = {"Ben", "Sam", "Yanny", "Patrick", "Cedric" };
    System.out.println(arr3[arr3.length - 1]);
    

    for (int i = 0; i < arr.length; i++){
      if (i == 1){
        arr[i] = 100;
      }
    }
    System.out.println(arr[1]);

  }
}
