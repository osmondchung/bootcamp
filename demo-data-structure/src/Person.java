import java.util.ArrayList;
import java.util.LinkedList;

public class Person {
  private Person person;
  private String name;

  public Person(String name, Person person){
    this.person = person;
    this.name = name;
  }

  Person getPerson(){
    return this.person;
  }

  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    Person p1 = new Person("lucas", new Person("leo", new Person("Jennie", null)));

    System.out.println(p1.getPerson().getPerson().getName());

    Person head = p1;
    int counter = 0;
    while (head != null){
      head = head.getPerson();
      counter++;
    }
    System.out.println(counter);

    LinkedList<Person2> persons = new LinkedList<>();
    persons.add(new Person2("Lucas"));
    persons.add(new Person2("Leo"));
    persons.add(new Person2("Sue"));
    persons.add(new Person2("Jennie"));
    persons.add(new Person2("Mary"));
    System.out.println(persons);
    System.out.println(persons.get(2).getName()); // slower thenarraylist get() coz this one search from the start
    System.out.println(persons.size());

  }
}
