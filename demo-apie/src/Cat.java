// Abstraction (Interface)
// Polymorphism
// Inheritance (current java file)
// Encapsulation

import java.util.Objects;

public class Cat extends Animal{
  // Inherit 
  // 1. Attributes
  // 2. Instance methods

  // Do not inherit
  // 1. Constructor
  private double weight;


  public Cat(String name, int age, double weight){
    // New Java keyword: super
    super(name, age); // calling parent class (Animal) constructor // coz animal's things privated  so need super to get 
    this.weight = weight;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public double getWeight(){
    return this.weight;
  }

  /*public int getAge(){
    System.out.println("22222222222");
    return super.getAge();
  }*/

  // Method Signature = method name + parameters
  // for Override, method signature + return type
  @Override
  public boolean equals(Object obj){
    // Step 1: Check this object's address is the same as the obj
    if (this == obj)
      return true;
    // Step 2: if obj is not an Cat object, return false
    // instanceof = asking if obj is an object of Cat
    if (!(obj instanceof Cat))
      return false;
    // Step 3: coz obj MUST be a cat object
    Cat cat = (Cat) obj;
    return Objects.equals(super.toString(), cat.toString())
      && Objects.equals(super.getAge(), cat.getAge())
      && Objects.equals(this.weight, cat.getWeight());
    //return super.getName().equals(cat.getName()) && super.getAge() == cat.getAge() && this.weight == cat.getWeight();
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  }
  
  // hashCode()
  @Override // override, checking if your parent class has this mehtod
  public int hashCode(){
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }

  // toString()
  @Override
  public String toString(){
    return "Cat("  //
      + super.toString() // from parent class
      + ",weight=" + this.weight //
      + ")";
  }


  public static void main(String[] args) {
    Cat c1 = new Cat("Brian", 14, 50.0);
    Cat c2 = new Cat("pepe", 3, 6.0);
    System.out.println(c1.getWeight());
    System.out.println(c1.getAge()); // 

    System.out.println(c1);

    
  }
}
