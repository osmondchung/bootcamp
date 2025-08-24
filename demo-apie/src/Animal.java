// - abstract class
// 1. can be extended
// 2. with constructor
// 3. we dont have animal Obect in the world //////////////////
// 4. With attribute and instance methods
// 5. with abstract method OR concrete method

// - class
// 1. can be extended
// 2. with constructor
// 3. for creating object /////////////////
// 4. With attribute and instance methods
// 5. with concrete method

public abstract class Animal { // animal is a abstract class
// Abstraction (Interface)
// Polymorphism
// Inheritance
// Encapsulation

  private String name;
  private int age;
  
  public Animal(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String intro(){
    return "This is " + this.name + ", and " + this.age + " year old. ";
  }

  @Override
  public String toString(){
    return "Animal(" //
      + "name=" + this.name //
      + ",age=" + this.age //
      + ")";
  }

  public static void main(String[] args) {
  }
}
