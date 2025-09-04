package BootcampaExercises.src;

import java.util.Scanner;

public class ExceptionExercise2 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 4. No matter if the exception is caught, finally print "Array retrieval attempt completed."
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index to retrieve: ");
    String input = scanner.nextLine(); // read String
    scanner.close();

    // code here ...
    // try, catch, finally
    try{
      if (input instanceof String){
        try {
          System.out.println("Element at index " + input + ": " + getIdx(input, numbers));
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("The root cause is: " + e.getMessage());
        }
        System.out.println("Array retrieval attempt completed");
      }
    } catch (NumberFormatException e) {
      System.out.print("Error: Please enter a valid number.");
    }

  }

  public static int getIdx(String input, int[] numbers){
    if (Integer.valueOf(input) > numbers.length){
      throw new ArrayIndexOutOfBoundsException("Error: Index is out of bounds.");
    }
    return numbers[Integer.valueOf(input)];
  }
}