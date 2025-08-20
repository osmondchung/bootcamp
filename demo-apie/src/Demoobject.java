// in Java, all classes by default implicitly entends object.class

import java.math.BigDecimal;

public class Demoobject {
  public static void main(String[] args) {
    Object o1 = new Object(); // Object.class is a concrete class

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

    Shape s1 = new Circle("Red", 3.5);
    Shape s2 = new Square("blue", 8);
    Shape s3 = new Circle("black", 4);

    Shape[] shapes = new Shape[] {s1, s2, s3};


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
