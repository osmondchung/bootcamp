import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoLambdaExamples {
  public static void main(String[] args) {
    // 1. for loop
    List<String> names = new ArrayList<>();
    names.add("ihoni");
    names.add("asdsa");
    names.add("123e1");
    names.forEach(n -> System.out.println(n));

    // Comparator
    // int compare9T o1, T o2)
    Comparator<Person> sortByDescending = (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(4));
    persons.add(new Person(66));
    persons.add(new Person(18));
    Collections.sort(persons, sortByDescending);
    System.out.println(persons);

    Collections.sort(persons, (p1, p2) -> p1.getAge() < p2.getAge() ? -1 : 1);
    System.out.println(persons);
    
  }

  public static class Person{
    private int age;

    public Person(int age){
    this.age = age;
    }

    public int getAge(){
      return this.age;
    }
    public String toString(){
      return "age= " + this.age;
    }
  }
}
