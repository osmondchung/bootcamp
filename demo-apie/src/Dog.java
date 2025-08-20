// Abstraction (Interface)
// Polymorphism
// Inheritance
// Encapsulation

// 
public class Dog extends Animal{

  private boolean isMale;

  public Dog(String name, int age, boolean isMale){
    super(name, age); // order matters
    this.isMale = isMale;
  }

  public boolean isMale(){
    return this.isMale;
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
