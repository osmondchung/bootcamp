public class DemoString {
  public static void main(String[] args){
    // Data types: 8 primitives, Class (String)
    String s1 = "wertyhjnbvcd";
    System.out.println(s1);

    //length
    System.out.println();
    System.out.println(s1.length());
    int length = s1.length();

    //equals
    if (s1.equals("Hello")){ // Java is case sensitive
      System.out.println("equals");
    } else{
      System.err.println("Not equals");
    }

    boolean isEqualsToXXX = s1.equals("Hello");
    System.out.println(isEqualsToXXX);

    // charAt(int index)
    System.out.println(s1.charAt(0)); // h, index = 0 means the first character of the string

    // print the last character of a string
    System.out.println(s1.charAt(s1.length() - 1));

    // index -> out of range (system error)
    // s1.charAt(-1);
    // System.out.println(s1.charAt(s1.length()));

    
  }
}
