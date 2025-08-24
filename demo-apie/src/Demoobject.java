// in Java, all classes by default implicitly entends object.class

import java.math.BigDecimal;

public class Demoobject {
  public static void main(String[] args) {

    // ! In Primitive World, Java helps conversion
    int x = 3; 
    long l = 3;

    // In Class (non-primitive) world, Java use Polymorphism to explain reference(address) and object
    // Long l2 = new Integer(3); // Class by default have to relate to each other

    Cat c1 = new Cat("Lucas", 10, 2.3);
    Animal a1 = new Cat("Leo", 3, 2.4);
    System.out.println(a1.intro());
    //System.out.println(a1.getWeight()); // 
    a1 = new Dog("niee", 3, true);
    System.out.println(a1.intro());
    System.out.println(a1.getAge());
    System.out.println(a1.getName());

    // WHy do we need parent class
    // 1. Inheritance -> Polymorphism -> Encapsulation
    // Advantageas: Maintainance
    Shape s1 = new Circle("Red", 3.5);
    Shape s2 = new Square("blue", 8);
    Shape s3 = new Circle("black", 4);

    Shape[] shapes = new Shape[] {s1, s2, s3};

    // Object.class
    // Cat extends Animal extends Object
    Object o1 = new Object(); // Object.class is a concrete class;
    o1 = new Cat("lucas", 2, 3.4);
    // Disadvantage: o1 can only call Object's methodCat

    // By defaut, Java disallow assigning o1 (Object object) to c2 (Cat type) coz risky
    // potential runtime error
    // Solution: Casting, risky
    Cat c2 = (Cat) o1;
    System.out.println(c2.getName());

    Cat c3 = new Cat("lucas", 2, 3.4);
    System.out.println(c2.equals(c3)); // false (different objects, before rewritting equals in Cat.class)
    // So, actually c2.equals() is referring to Object.equals
    // True, after rewritting equals() in Cat.class


    System.out.println(c2.hashCode() == c3.hashCode()); // true, coz rewritted hashCode()
    // toString()
    System.out.println(c2); // Cat(Animal(name=lucas,age=2),weight=3.4)
    System.out.println(c3); // Cat(Animal(name=lucas,age=2),weight=3.4)
  }

  // Parent Class
  // Method Designer: Requires object can do something (i.e. area())
  // Method User: Use Child/Parent classes relationship implement method content (how)

  public static double totalArea(Shape[] shapes){
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++){
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area())) ;
    }
    return totalArea.doubleValue();
  }
  

}
