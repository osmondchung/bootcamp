import java.util.Arrays;

public class DemoPassByValue {
  public static void main(String[] args) {
    // 1. Pass by value (8 primitives + 8 Wrapper Class + String)
    String p1 = "hello";
    String p2 = "john";
    System.out.println(compareStringLength(p1, p2));
    System.out.println(p1);
    // 2. pass by reference (Array, all other Custom Classes)
    int[] ages = new int[] {17, 3, 80, 2};
    sort(ages);
    System.out.println(Arrays.toString(ages));

  }
  public static void sort(int[] arr){
    Arrays.sort(arr);
  }

  public static int compareStringLength(String s1, String s2){
    s1 = s1 + "!!!";
    if (s1.length() > s2.length()) 
      return 1;
    else if (s1.length() < s2.length())
      return -1;
    else 
      return 0;
  }
}

