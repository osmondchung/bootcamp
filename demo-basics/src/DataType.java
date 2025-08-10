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
    char ch = 'あ';
    char ch2 = '是';
    char ch3 = '時';

    int chAscii = ch;
    System.out.println(chAscii);
    int chAscii2 = ch2;
    System.out.println(chAscii2);

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

    // short s5 = b1 + s3;  Nooooooooooo (cannot assign int value to short variable!!!!!!)
    // byte, short, char operands are automatically promoted to int 
    int s5 = b1 + s3; // byte + short ->  int + int -> int
    // short and byte are special cases!!!!!!!
    System.out.println(s5);

    //byte b10 = b1 + 1; // int cannot put into byte
    // coz  byte + int -> int, so we cannot assign int value into byte variable
    int r2 = b1 + 1;

    // Overflow
    int i10 = 2_147_483_647;
    int i11 = i10 + 1;
    int i12 = i10 + 10;
    System.out.println(i11);
    System.out.println(i12);

    int i13 = 2_100_000_000 + 100_000_000;
    System.out.println(i13);

    // by default, 7.84 is a double value
    // by default, 7 is a int value
    float width = 7.84f;
    long k = 10L;

    // coz 7.77 is defaultly double value , and we cannot assign double value to float variable
    // double > float
    // float -> 6-7 decimals digits
    // double -> 15-17 decimals digits
    // float f1 = 7.77;

    float length = 5.3f;
    float area = length * width;
    System.out.println(area);

    //float area2 = length * 7.84; // double > float so cant assign into float variable!!

    // ASCII Code
    char letter = 97;
    System.out.println(letter); // we can assign char value or ASCII code

    //char letter2 = letter + 1;
    // Step 1: char value + int value -> int -> cannot assign int value to char variable

    // Solution downcasting
    char letter3 = (char) (letter + 1); //cast // downcast (int -> char)
    System.out.println(letter3);
    // downcast (int -> char)

    int asciiForZero = 48;
    char as = (char) asciiForZero;
    System.out.println(as);

    int asciiForA = 'A';
    // Step 2: assign char value into int var
    // Step 3: auto-convert char value to ascii code
    System.out.println(asciiForA);

    char letterForZ = 'A' + 25; // explicit char value + explicit int value (no risk)
    System.out.println(letterForZ);
    
    int distance = 2;
    char letterForC = (char) ('A' + distance); // this one not + explicit int
    System.out.println(letterForC);


  }
}
