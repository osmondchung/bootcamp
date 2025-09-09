import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    // Lambda -> Stream
    Person p1 = new Person("John", 38);
    Person p2 = new Person("Jennie", 67);
    Person p3 = new Person("Steven", 18);
    List<Person> persons = new ArrayList<>();
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    for (Person p : persons){
      if (p.getAge() < 65)
        System.out.println(p);
    }

    persons.forEach(p -> {
      if (p.getAge() > 65) {
        System.out.println(p.getName());
      }
    });
    // Lambda -> Stream mode
    persons.stream() // Stream<Person>
      .filter(p -> p.getAge() > 65)
      .forEach(p -> System.out.println(p.name));

    // filter + collect into another list
    // List<Person> -> Stream<Person> -> List<Person>
    List<Person> elderlyPersons = persons.stream()
      //.filter(p -> p.getAge() > 65)
      //.filter(p -> p.isElderly())
      .filter(Person::isElderly) // method reference
      .collect(Collectors.toList());
   // System.out.println(elderlyPersons);

    List<Person> idk = persons.stream().filter(p -> p.getAge() < 40 && p.getName().startsWith("J"))
      .collect(Collectors.toList());
    System.out.println(idk);

    List<Integer> intList = new ArrayList<>();
    intList.add(8);
    intList.add(7);
    intList.add(3);
    intList.add(100);
    intList.add(97);
    List<Integer> idk2 = intList.stream()
      .filter(p -> p % 2 != 0)
      .collect(Collectors.toList());
    System.out.println(idk2);

    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();
    List<String> l3 = new ArrayList<>();
    l1.add("apple");
    l1.add("banana");
    l1.add("orange");
    l2.add("John");
    l2.add("Lucas");
    l2.add("Leo");
    l3.add("Monday");
    l3.add("Friday");
    l3.add("Wednsday");
    List<List<String>> ll4 = new ArrayList<>();
    ll4.add(l1);
    ll4.add(l2);
    ll4.add(l3);
    List<List<String>> idk3 = ll4.stream()
      .filter(l -> l.stream().anyMatch(e -> e.length() > 5))
      .collect(Collectors.toList());
    System.out.println(idk3);

    // List<Persons> -> List<String> 
    Comparator<Person> sortedByAge = 
      (p4, p5) -> p4.getAge() > p5.getAge() ? -1 : 1;

    List<String> nameList = persons.stream() //Stream<Persons>
      .sorted(sortedByAge)
      .map(p -> p.getName()) // Stream<String>
      .collect(Collectors.toList()); //List<String>
      // collect -> open a new arrayList
    System.out.println(nameList);

  }

  public static class Person{
    private String name;
    private int age;

    public Person(String name, int age){
      this.name = name;
      this.age = age;
    }

    public int getAge(){
      return this.age;
    }

    public String getName(){
      return this.name;
    }

    public boolean isElderly(){
      return this.age > 65;
    }

    public String toString(){
      return "name= "+ name + " age= " + this.age;
    }
  }
}
