import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemoHashMap {
  public static void main(String[] args) {
    // String (Student ID) -> String (student name)
    // solution 1: List<student>
    // solution 2: List<String>, List<String>

    // searching -> HashMap
    // <String, String> -> <key, value>
    HashMap<String, String> studentMap = new HashMap<>();
    studentMap.put("s1234", "John"); // put an entry into a map
    studentMap.put("s7890", "Alex"); // put an entry into a map
    System.out.println(studentMap.get("s7890")); // entry's value

    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Leo", 3));
    cats.add(new Cat("Steven", 4));
    cats.add(new Cat("Oscar", 4));
    Cat c1 = cats.get(0);
    Cat c2 = cats.get(1);
    Cat c3 = cats.get(2);

    HashMap<String, Cat> catMap = new HashMap<>();
    catMap.put(c1.getName(), c1);
    catMap.put(c2.getName(), c2);
    catMap.put(c3.getName(), c3);

    System.out.println((catMap.get("Steven")).getAge());
    System.out.println(catMap.get("Steven").toString());

    // If the type of key is String/Wrapper Class, you dont need rewrite equals()

    List<Dog> dogs = new ArrayList<>(); 
    HashMap<Dog, String> dogMap = new HashMap<>(); // Leo and 3
    dogs.add(new Dog("weeeee", 5));
    dogs.add(new Dog("wooooo", 6));
    for (Dog dog : dogs){
      dogMap.put(dog, dog.getName() + " and " + dog.getAge());
    }
    
    System.out.println(dogMap.get(new Dog("weeeee", 5))); // null if no override hashcode 
    // !!!!!!!!!!!!!!!!!!!!!! Write the three override methods
  }
}
