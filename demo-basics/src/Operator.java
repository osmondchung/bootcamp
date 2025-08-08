public class Operator {
  public static void main(String[] args){
    // Math +=, -=...
    int x = 3;
    x += 4;
    System.out.println(x);

    int y = 9;
    y -= 8;
    System.out.println(y);

    int z = 8;
    z *= 2;
    System.out.println(z);

    int q = 5;
    q /= 2;
    System.out.println(q);

    // +1
    int u = 1;
    u++;
    u = u + 1;
    u += 1;
    System.out.println(u);

    // -1
    int t = 1;
    t--;
    System.out.println(t);

    // Comparison >, <, 
    int age = 70;
    boolean isElderly = age > 65;
    if (age > 65){
      isElderly = true;
    }
    char ch = 'a';
    boolean isCharEqualsToA = ch == 97;
    System.out.println(isCharEqualsToA); //true

    char grade = 'R'; // can be A, B, C, D, E, F
    //boolean isGradeValid = grade <= 71 && grade >= 65;
    boolean isGradeValid;

    // Approach 2:
    isGradeValid = false;
    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F'){
      isGradeValid = true;
    }

    // Approach 3: ASCII value range cheack
    isGradeValid = grade >= 'A' && grade <= 'F';
    // coz we are using comparison operator 
    // convert char value to int value before comparison
    System.out.println(isGradeValid);

    // Odd/ Even number
    int number = 23;
    boolean isOdd = number % 2 == 1;
    // This one readability is good
    if (isOdd){
      System.err.println("hello");
    }
    // This one not good
    if (number % 2 == 1){
      System.out.println("Hello");
    }


    // make use of assumption and assignment
    int a = 4;
    int b = 7;
    int c = 9;
    int max = a;
    if (a > b){
      max = a;
    }
    if (c > max){
      max = c;
    }

    System.out.println("max value=" + max);
    
  }
}
