import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // Given elements in ArrayList
    List<String> names = Arrays.asList("John", "Mary", "Susan"); // create Arraylist Object
    System.out.println(names);

    List<String> names2 = List.of("John", "nig", "gin");
    System.out.println(names2);

    List<String> names3 = new ArrayList<>(Arrays.asList("John", "bruh", "hellnah"));
    System.out.println(names3);

    //names.add("Lucas"); //java.lang.UnsupportedOperationException
    //names2.add("Lucas"); //java.lang.UnsupportedOperationException
    names3.add("Lucas"); // OK
    //names3.remove("Lucas");
    //names2.remove("Lucas");
    //names.remove("Lucas");
    
    // Arrays.asList() vs List.of
    // 1. add() and remove() are not allowed
    // 2. Arrays.asList() -> able to modify element, but List.of cannot
    names.set(0, "yowee");
    System.out.println(names);
    //names2.set(0, "yowee1");
    //System.out.println(names2);

  }
  // Array -> arraylist (Arrays.asList(arr))
  public List<Integer> findOddNumbers(Integer[] arr){
    return Arrays.asList(arr).stream().filter(i -> i%2 !=0).collect(Collectors.toList());
  }
}
