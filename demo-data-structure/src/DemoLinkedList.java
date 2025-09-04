import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoLinkedList {
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

    // List
    List<Person2> personlist = new LinkedList<>();
    personlist.add(new Person2("lucas"));
    personlist.add(new Person2("Mary"));
    
    System.out.println(getFirstPerson(personlist).getName());

    // Shape -> Circle/Square
    Shape c1 = new Circle("blu", 3.3);
    Shape s1 = new Square("wdef", 3.3);
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(c1);
    shapes.add(s1);
    System.out.println(area(shapes));

    // Queue/ Deque
    // Queue must First in first out
    Queue<String> names = new ArrayDeque<>(); // LinkedList or ArrayDeque
    names.add("John");
    names.add("Leo");
    names.add("jhvcvhjk");
    System.out.println(names);
    //names.poll(); // Retrieves and removes the head of this queue, or returns null if this queue is empty.
    //System.out.println(names.poll());
    System.out.println(names.size());
    //names.remove();
    // Queue is not for looping, it is for consuming

    // Deque can but not must first in first out
    Deque<String> nameDeque = new LinkedList<>(); // ArrayDeque or LinkedList
    nameDeque.add("pdop");
    nameDeque.add("asdsa");
    nameDeque.add("osew"); // addLast by default
    nameDeque.addFirst("tracy");
    nameDeque.addLast("venus");
    System.out.println(nameDeque);
    nameDeque.poll(); // remove head
    System.out.println(nameDeque + "            i");
    nameDeque.pollLast();
    System.out.println(nameDeque);

    System.out.println(nameDeque.peek()); // lookup or get head
    System.out.println(nameDeque.peekLast()); // lookup or get tail

    while (!nameDeque.isEmpty()){
      System.out.println(nameDeque.poll());
    }
    
  }
  // get the head of list, if not found, return null
  public static Person2 getFirstPerson(List<Person2> persons){
    if (persons == null || persons.size() == 0)
      return null;
    return persons.get(0);
  }

  // Static method: List<Shape> -> Calculate total area
  public static double area(List<Shape> shapes){
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

}
