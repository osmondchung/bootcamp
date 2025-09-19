import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    // Java 8
    // Eample 1
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Alex");
    names.add("sally");
    names.forEach(e -> System.out.println(e));

    // Consumer by lambda
    // e -> system.out.println(e)

    // Consumer by method reference
    names.forEach(System.out::println);

    // Example 2
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length();
    Supplier<Integer> nameLength2 = name::length;
    System.out.println(nameLength.get());
    System.out.println(nameLength2.get());

    Supplier<Bird> birdSupplier = () -> new Bird(); // this is a mehtod, no Object is created
    Supplier<Bird> birdSupplier2 = Bird::new; // Object is created after we call this method.
    Bird bird1 = birdSupplier.get();
    Bird bird2 = birdSupplier2.get();

    // Example 3
    Comparator<Integer> sortByDesc = (i1, i2) -> i2.compareTo(i1);
    // For this case, method reference can handle ascending ordering logic ONLY
    Comparator<Integer> sortByDesc2 = Integer::compareTo;

    List<Integer> integers3 = List.of(1,2,3,4,5,6);
    List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
    List<Integer> integers2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

    Collections.sort(integers, sortByDesc2);
    System.out.println(integers);
    Collections.sort(integers2, sortByDesc);
    System.out.println(integers2);

    // Example 4 (Static method)
    Function<String, Integer> conversionHelper = s -> Integer.valueOf(s);
    System.out.println(conversionHelper.apply("123"));
    Function<String, Integer> conversionHelper2 = Integer::valueOf;
    System.out.println(conversionHelper2.apply("123"));
    

  }
}
