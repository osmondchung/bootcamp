public class DemoString {
  public static void main(String[] args){
    // Data types: 8 primitives, Class (String)
    String s1 = "wertyhjnbvcd";
    System.out.println(s1);

    // 1. length
    System.out.println();
    System.out.println(s1.length());
    int length = s1.length();

    // 2. equals
    if (s1.equals("Hello")){ // Java is case sensitive
      System.out.println("equals");
    } else{
      System.err.println("Not equals");
    }

    boolean isEqualsToXXX = s1.equals("Hello");
    System.out.println(isEqualsToXXX);

    // 3. charAt(int index)
    System.out.println(s1.charAt(0)); // h, index = 0 means the first character of the string

    // print the last character of a string
    System.out.println(s1.charAt(s1.length() - 1));

    // index -> out of range (system error)
    // s1.charAt(-1);
    // System.out.println(s1.charAt(s1.length()));

    // 4. Contains()
    String s2 = "Hello";
    String targetStr = "ll";
    System.out.println(s2.contains(targetStr));

    // 5. indexOf()
    // input: char, output: index
    // return the first index of the first character
    System.out.println("halo".indexOf('l'));
    System.out.println("hello".indexOf('l'));
    System.out.println("hello".indexOf('p')); // -1 means not found
    System.out.println("hello world".indexOf("lo")); 
    System.out.println("hello world".indexOf("llo"));

    // lastIndexOf()
    
    // 6. equals/ equalsIgnoreCase
    System.out.println("apple".equals("apple"));
    System.out.println("apple".equals("Apple"));
    System.out.println("apple".equalsIgnoreCase("Apple"));

    // 7. toUpperCase()/ toLowerCase()
    System.out.println("apple".toUpperCase());
    System.out.println("apple".toLowerCase());

    // 8. startsWith/ endsWith
    System.out.println("apple".startsWith("a"));
    System.out.println("apple".startsWith("app"));
    System.out.println("apple".startsWith("A"));

    System.out.println("apple".endsWith("e"));
    System.out.println("apple".endsWith("ple"));
    System.out.println("apple".endsWith("E"));

    String s3 = "appLe";
    
    // chain method
    //System.out.println(s2.toUpperCase().endsWith("LE")); // this one not good
    boolean result = s3.toLowerCase().endsWith("le");
    System.out.println(result);

    // 9. concat
    System.out.println("hello".concat("world"));
    String s4 = "apple";

    // Both String value and String variable can use methods
    System.out.println(s4.concat("!!!"));
    System.out.println(s4);
    
    System.out.println(s4.concat("banana").length());
    System.out.println(s4.concat("lemon").equals("applelemon"));

    // 10. replace()
    String s5 = "banana";
    String result2 = s4.replace('a', 'x');
    System.out.println(s5);
    System.out.println(result2);

    System.out.println(s5.replace("an", "ijk"));
    System.out.println(s5.replace("a", ""));

    // 11. isEmpty()/ isBlank()
    System.out.println("apple".isEmpty());
    System.out.println("".isEmpty());

    String s6 = null;
    String s7 = "";

    String s8 = "      ";
    System.out.println(s8.length());
    System.out.println(s8.isEmpty());
    System.out.println(s8.isBlank());

    System.out.println("".isEmpty());
    System.out.println("".isBlank());

  }
}
