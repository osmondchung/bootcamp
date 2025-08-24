// Abstraction (Interface)
// Polymorphism
// Inheritance
// Encapsulation

// 

import java.util.Objects;

public class Dog extends Animal{

  private boolean isMale;

  public Dog(String name, int age, boolean isMale){
    super(name, age); // order matters
    this.isMale = isMale;
  }

  public boolean isMale(){
    return this.isMale;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Dog))
      return false;
    Dog dog = (Dog) obj;
      return super.getName().equals(dog.getName()) && super.getAge() == dog.getAge() && this.isMale == dog.isMale();
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.isMale, super.getAge(), super.getName());
  }

  @Override
  public String toString(){
    return "Dog()" //
      + super.toString()
      + ",weight=" + this.isMale
      + ")";
  }

  // 
  public static void main(String[] args) {
    Dog d1 = new Dog("benson", 11, true);
    Dog d2 = new Dog("yanny", 2, false);
    // 
    System.out.println(d1.getName());
    System.out.println(d2.getAge());
    System.out.println(d1.isMale()); // true
  }

}
