import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("John");
    names.add("Leo");
    System.out.println(names.size());
    System.out.println(names.isEmpty());
    System.out.println(names.contains("Leo"));
    System.out.println(names);

    for (String name : names){
      System.out.println(names);
    }

    System.out.println(names.remove("Leo"));
    System.out.println(names.remove(new String("John")));
    System.out.println(names.size());

    // HashSet vs ArrayList
    // 1. Disallow duplicated
    names.add("oscar");
    names.add("Jacky");
    names.add("oscar"); 
    names.add("Oscar");
    names.add("nig");
    System.out.println(names.size()); // 2. coz HashSet removes duplicated object automatically
    // Reason : HashSet.add() -> object.equals() (String.equals())

    // 2. No ordering ("Hash")
    System.out.println(names);

    // ArrayList<Hero> heros
    // Objects.class -> equals() -> checking "=="
    //heros.remove(new Hero("leo1234")); // 

    // Important points for both ArrayList and HashSet Override equals() for Object
    ArrayList<Cat> cats = new ArrayList<>();

    Cat c4 = new Cat("Kelly");
    cats.add(c4);
    cats.add(new Cat("Sue"));
    Cat c5 = new Cat("Kelly");

    cats.add(c5);
    System.out.println(cats.size());

    cats.remove(new Cat("Kelly")); // Remove fail, missing equals() in Cat class
    System.out.println(cats.size()); // 3

    cats.remove(c4);
    cats.remove(c5);
    System.out.println(cats.size()); // 1. it works, coz it is calling Object.equals()

    // For correct solution: rewrite equals() in Cat.class

    // Q1. remove duplicate by HashSet
    ArrayList<String> emails = new ArrayList<>();
    emails.add("leo@gmail.com");
    emails.add("leo1234@gmail.com");
    emails.add("leo@gmail.com");

    HashSet<String> emailss = new HashSet<>();
    for (String email : emails){
      emailss.add(email);
    }
    System.out.println(emailss);


    // Q2. construct a HashMap (at least two entries)
    HashMap<String, ArrayList<Dog>> dogListMap = new HashMap<>();
    ArrayList<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("weeee", 9));
    dogs.add(new Dog("woooo", 6));
    for (Dog dog : dogs){
      dogListMap.put(dog.getName(),dogs);
    }
    System.out.println(dogListMap.get("weeee"));
    System.out.println(dogListMap.get("woooo"));

    // Q3. Convert Cat Array into Cat ArrayList, print out all cat names
    Cat[] catArray = new Cat[] {new Cat("Kelly", 3), new Cat("Oscar", 10)};
    ArrayList<Cat> cats2 = new ArrayList<>();
    for (Cat cat : catArray){
      cats2.add(cat);
    }
    System.out.println(cats2);

  }
}
