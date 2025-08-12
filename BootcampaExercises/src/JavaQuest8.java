package BootcampaExercises.src;

/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax = testCase4[1];
    int Max = testCase4[0];
    // code here ...
    for (int i = 0; i < testCase4.length; i++){
      if (testCase4[i] > Max){
        secondMax = Max;
        Max = testCase4[i];
      } else if (testCase4[i] > secondMax && testCase4[i] != Max){
        secondMax = testCase4[i];
      } 
    }
    System.out.println(secondMax);
  }
}