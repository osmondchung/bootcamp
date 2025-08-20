import java.util.Arrays;

public class Demoarray {
  public static void main(String[] args) {
    // copyOf()
    String[] arr = new String[] {"Jhon", "Mary", "Tom"};
    String[] newArr = Arrays.copyOf(arr, arr.length);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(newArr));

    arr[0] = "Jack";
    System.out.println(Arrays.toString(arr));

    // Sorting
    int[] ages = new int[] {23, 45, 12, 88, 66};
    Arrays.sort(ages);
    System.out.println(Arrays.toString(ages));

    
  }
}
