public class DataType {
  public static void main(String[] args){
    String s1 = "Weeeeeeeeeeeeee";
    System.out.println(s1);

    //boolean isMale = true;
    int age = 66;
    boolean isElderly = age > 65;
    // Step 1: age > 65 -> true value
    // Step 2: assign true value into boolean variable
    System.out.println(isElderly);

    char gender = 'M';
    System.out.println(gender);
    // define char value -> use single quote ''
    // define String value -> use double qote ""
    // char value has to be single character

    // byte, short, int, long
    byte age2 = 100;
    // byte: -128 to 127
    // short: -32xxx to 32xxx
    // int: -2.1 billion to 2.1 billion
    // long: -2^62 to 2^62

    // Java: long > int > short > byte (level of type)
    long l1 = 100;
    // assign 100 int value into long type variable 
    System.out.println(l1);
    
    long l2 = 100L;
    // assign 100L long value into long type variable 
    System.out.println(l2);
    
    byte b1 = 127;
    byte b2 = -128;
    
    short s3 = 32767;
    short s4 = -32768;

    int result = b1 + 7;
    // Step 1: byte value + int value -> int value
    // Step 2: assign int value into int variable
    System.out.println(result);

    int s5 = b1 + s3;
    System.out.println(s5);
  }
}
