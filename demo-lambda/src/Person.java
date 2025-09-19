public record Person(int age, String name) {
  public static final int x = 24;

  public static int getX(){
    return x + 10;
  }
  //private String name;
  //private int age;

  // With 
  // all argument constructor, getter, toString, equals, hashCode

  // Without
  // Setter, empty constructor
  public static void main(String[] args) {
    Person p1 = new Person(3, "John"); // all argument constructor
    System.out.println(p1); // toString()
    System.out.println(p1.age()); // getAge()
    System.out.println(p1.name()); // getName()

    Person p2 = new Person(3, "John");
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());

    System.out.println(getX());
    
  }
}
