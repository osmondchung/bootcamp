import java.util.Scanner;

public class Conditional {
  public static void main(String[] args){
    // if else -> control program flow
    /*int x = 19;
    if (x > 12){
      System.out.println("hello");
    } else {
      System.out.println("Goodbye");
    }
    double y = 1234.56;
    int counter = 0;
    if (y > 999.5){
      counter += 1;
    } else {
      counter += 2;
    }
    System.out.println(counter);

    int a = 10;
    int b = 90;
    if (a > 5 && b > 80){
      System.out.println("Weeeeeeee");
    } else {
      System.out.println("Woooooooo");
    }

    // && > ||
    if (a > 9 && b > 90 || b % 2 == 0){
      System.out.println("Correct");
    } else {
      System.out.println("Incorrect");
    }*/


    /*// Gender (female)
    if (isFemale == true && isSmoker == false){
      premium = premium * 1.1;
      System.out.println("Premium= " + premium);
      if (isSmoker == true){
        premium = premium * 1.15;
        System.out.println("Premium= " + premium);
      }
    } 
    // Gender (male)
    else {
      if (isSmoker == true && age < 50){
        premium = premium * 1.15;
        System.out.println("Premium= " + premium);
      } else {
        premium = premium * 1.15 * 
        System.out.println("Premium= " + premium);
      } 
    }*/


    // female -> 10% more premium
    // smoker -> 15% more premium
    // age > 50 and is a male -> 8% more premium
    /*Scanner myObj = new Scanner(System.in);
    Scanner myObj2 = new Scanner(System.in);
    Scanner myObj3 = new Scanner(System.in);
    int age = 44;
    //char gender = 'F';
    //char smoker = 'F';
    boolean isFemale = true;
    boolean isSmoker = false;
    double premium = 100.0;
    System.out.println("Female (true or false)?");
    isFemale = Boolean.parseBoolean(myObj.nextLine());
    System.out.println("Is a smoker or not (true or false)?");
    isSmoker = Boolean.parseBoolean(myObj2.nextLine());
    System.out.println("What is the age?");
    age = Integer.parseInt(myObj3.nextLine());

    if (isFemale == true) {
      if (isSmoker == true) {
        if (age > 50) {
          premium = premium + 0.1 * premium + 0.15 * premium;
          System.out.println("Premium for a 50+ age female smoker is: " + premium);
        } else {
          premium = premium + 0.1 * premium + 0.15 * premium;
          System.out.println("Premium for a <50 age female smoker is: " + premium);
        }
      } else if (age > 50) {
        premium = premium + 0.1 * premium;
        System.out.println("Premium for a 50+ age female non-smoker is: " + premium);
      } else {
        premium = premium + 0.1 * premium;
        System.out.println("Premium for a <50 age female non-smoker is: " + premium);
      }
    } 
    else if (isSmoker == true){
      if (age < 50) {
        premium = premium + 0.15 * premium;
        System.out.println("Premium for a <50 age male smoker is: " + premium);
      } else {
        premium = premium + 0.15 * premium + 0.08 * premium;
        System.out.println("Premium for a 50+ age male smoker is: " + premium);
      }
    } else if (age < 50) {
      System.out.println("Premium for a <50 age male non-smoker is: " + premium);
    } else {
      premium = premium + 0.08 * premium;
      System.out.println("Premium for a 50+ age male non-smoker is: " + premium);
    }*/


    /*// Program most importantly: 
    int age = 44;
    //char gender = 'F';
    //char smoker = 'F';
    boolean isMale = true;
    boolean isSmoker = true;
    double premium = 100.0;
    double extraPremPct = 0.0;
    if (isMale){
      if (age > 50){
        extraPremPct = extraPremPct + 8.0;
      }
      else {// Female
        extraPremPct = extraPremPct + 10.0;
      }
    if (isSmoker){
        extraPremPct = extraPremPct + 15.0;
    }
      premium = premium * (100 + extraPremPct) / 100.0;
      System.out.println(premium);
    }*/

    // leap year
    // divided by 4 -> leap year
    // divided by 100 -> Not a leap year
    // divided by 400 -> leap year
    int year = 1900;
    boolean isLeapYear = false;
    boolean isDividedBy4 = year % 4 == 0;
    boolean isDividedBy100 = year % 100 == 0;
    boolean isDividedBy400 = year % 400 == 0;

    /*if (isDividedBy4){
      if (isDividedBy100){
        if (isDividedBy400){
        isLeapYear = true;
        }else{ // this one can delete coz default, coz default is false so can just consider true
          isLeapYear = false;
        }
      }else{
        isLeapYear = true;
      }
    }

    System.out.println("Leap Year?" + isLeapYear);*/
    ///isLeapYear = isDividedBy4 && isDividedBy100 && isDividedBy400 || isDividedBy4 && !isDividedBy100;
    isLeapYear = isDividedBy4 && (isDividedBy100 && isDividedBy400 || !isDividedBy100);
    System.out.println("Leap Year?" + isLeapYear);
  }
}
