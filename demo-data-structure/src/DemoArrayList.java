import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[] {"asdas", "asda", "Dsadad"};
    for (String name : names){
      System.out.println(name);
    }

    // Diasadvantages of array
    // 1. we need a new array if an additional element is required
    // 2. Modify element: search element one by one, and then replace it 
    // Solution: ArrayList
    ArrayList<String> emails = new ArrayList<String>();
    //emails = new ArrayList<Integer>();
    // ArrayList of String has no relationship with ArrayList of Integer
    // ArrayList of Integer has no relationship with ArrayList of Long
    //ArrayList<Long> numbers = new ArrayList<Integer>();

    // the reference type of ArrayList must be the same as the object type of ArrayList
    // Java allows implicitly align reference type and object type for arraylist
    ArrayList<String> bookNames = new ArrayList<>();
    bookNames.add("ABC");
    bookNames.add("gfhj");
    bookNames.add("bnon");
    for (String bookName : bookNames){
      System.out.println(bookName);
    }
    //bookNames.remove(1);
    System.out.println(bookNames);

    int counter = 0;
    for (int i = 0; i < 3;i++){
      if (bookNames.get(i).startsWith("A")){
        counter++;
      }
    }
    System.out.println(counter);

    // ArrayList is in order, coz the underlying data structure is array
    bookNames.add("qqwq");
    System.out.println(bookNames);
    bookNames.addFirst("nig");
    System.out.println(bookNames);

    bookNames.addLast("gia");
    System.out.println(bookNames);

    System.out.println(bookNames.contains("nig"));
    System.out.println(bookNames.isEmpty()); // true
    //bookNames = null; // Null pointer, not same as empty
    bookNames.size(); // same as array length
    bookNames.set(1, "lol");
    System.out.println(bookNames);
    System.out.println(bookNames.get(2)); // get the third item in the arraylist
    bookNames.clear();

    //ArrayList,Cat>
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("inok");
    Cat c2 = new Cat("flare");

    cats.add(c1);
    c1.setName("paola");
    cats.add(c2);

    System.out.println(c1);
    System.out.println(c2);

    for (Cat cat : cats){
      System.out.println(cat.getName());
    }

    // Interface: List
    // Polymorphism: List is an interface of ArrayList, List<X> is also the interface of ArrayList<X> 
    List<String> names2 = new ArrayList<>();
    names2.add("John");
    names2.add("sue");

  }
}
