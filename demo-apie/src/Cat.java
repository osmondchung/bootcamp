// Abstraction (Interface)
// Polymorphism
// Inheritance (current java file)
// Encapsulation

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

  public int getAge(){
    System.out.println("22222222222");
    return super.getAge();
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("Brian", 14, 50.0);
    Cat c2 = new Cat("pepe", 3, 6.0);
    System.out.println(c1.getWeight());
    System.out.println(c1.getAge()); // 
  }
}
