public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 3;
    Integer x2 = new Integer(3);
    System.out.println(x2);
    
    // x2 -> object
    // x -> value
    x2 = 4;
    long l1 = x2.longValue(); // longValue() is a presentation of 3
    
    System.out.println(x2 > 3); // true

    Integer another = 10;
    System.out.println(x2.compareTo(another)); // -1
    System.out.println(x2.compareTo(4)); // 0 (int 4 -> Integer 4, auto-box)

    System.out.println(x2.equals(another)); // false

    // another example
    Integer x10 = new Integer(100);
    Integer x11 = new Integer(100);
    System.out.println(x10.equals(x11));
    // coz "==" is cheacking object address for objects
    System.out.println(x10 == x11); // false, because they are different objects

    Integer x12 = x10;
    System.out.println(x12 == x10);

    // Wrapper Class (Internal Cache)
    // Integer - > -128 to 127
    Integer x13 = 100; // 
    Integer x14 = 100;
    System.out.println(x13 == x14); // true
    // coz "= 100" -> within internal cache -> Java Not create new object -> resue same object
    System.out.println(x13 == x14);  //true

    Integer x15 = 128;
    Integer x16 = 128;
    // 128 -> Out of the internal cache range  -> Java create new object
    System.out.println(x15.equals(x16)); // true
    System.out.println(x15 == x16); // false

    Integer x17 = new Integer(100);
    Integer x18 = 100;
    System.out.println(x17.equals(x18)); // true
    System.out.println(x17 == x18); // false

    // The above theory applies to Byte, Short, Long, Integer
    // Character (Cache 0-127)
    // Boolean (true, false)
    // But not for Float and Double

    Boolean isAdult = true;
    Boolean isElderly = new Boolean(true); 
    System.out.println(isAdult.equals(true));

    // String has no range criteria
    // String -> literial pool
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // check object 
    System.out.println(s1.equals(s2)); // check address // Class use equals(), comparTo()

    String password = "1234";
    System.out.println(password.equals("1234")); // true

    String s3 = new String("hello");
    String s4 = "hello2";
    System.out.println(s1 == s4); // false
    System.out.println(s1 == s3); // false

    // "+" operation in String
    String str1 = "hello";
    String str2 = str1 + "world"; // return new String object
    System.out.println(str1 == str2); // false

    StringBuilder sb1 = new StringBuilder("helo");
    StringBuilder sb2 = sb1.append("world");
    System.out.println(sb1 == sb2);// true

  }
}
