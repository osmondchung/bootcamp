import java.util.Scanner;

public class DemoScanner2 {
  public static void main(String[] args) {

    

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("please enter a number: ");
    int number1 = scanner1.nextInt();
    int bomb = (int) (Math.random() * 99 + 1); 
    System.out.println(bomb);
    int max = 100;
    int min = 1;

    do {
      System.out.println("please select a number between " + min + " and " + max + ":");
      number1 = scanner1.nextInt();
      if (number1 > bomb){
        max = number1 - 1;
      }  else if (number1 < bomb){
        min = number1 + 1;
      }
    } while (bomb != number1);

    /*while (number1 != bomb){
      System.out.println("please select a number between " + min + " and " + max + ":");
      number1 = scanner1.nextInt();
      if (number1 > bomb){
        max = number1 - 1;
      }  else if (number1 < bomb){
        min = number1 + 1;
      }

    }*/
    System.out.println("matched");
    scanner1.close();

  }
}
