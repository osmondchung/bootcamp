  // Java: Object Oriented Programming (OOP), C++, C#, etc

  // Blueprint
  // the person we want to describe in this world have name and age only.
  // Java assume object doesnt duplicated
  // we think that name and ages are enough for describing and distinguish every object in the class. 

import java.math.BigDecimal;

public class Person {
  // Attribute
  private int age;
  private String name;

  // Setter
  // "this" -> Object.  ,  p1.setAge(17) ->put 17 into "this" Object (p1)
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  //Getter
  public int getAge(){
    return this.age;
  }

  public String getName(){
    return this.name;
  }

  public boolean isElderly(){
    return this.age >65;
  }

  public static boolean isElderly(int age){ //!!!!!!!!!!!!
    return age > 65;
  }

  public static boolean isElderly2(Person person){ //!!!!!!!!!!!!
    return person.getAge() > 65;
  }
  
  public static void main(String[] args) {
    // "new" -> create object
    // "person" -> class name
    // "()" -> constructor
    // "p1" -> this is a name for you to call the object in memory
    Person p1 = new Person();
    BigDecimal bd1 = new BigDecimal("3.4");

    new Person(); // create a person object in memory, but without a name for later use
    Person p3 = new Person();
    p1.setAge(17);

    p1.getAge();
    System.out.println(p1.getAge());

    p1.setName("osmond");
    p1.getName();
    System.out.println(p1.getName());

  }
}