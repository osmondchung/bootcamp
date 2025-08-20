import java.math.BigDecimal;

public class Circle {
  // attribute: raw data, fundemental to form a circle
  private double radius;
  
  // Method: presentation of existing attributes
  public double getDiameter(){
    // BigDecimal 
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2)).doubleValue();
  }

  // getter, setter
  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getArea(){
    return BigDecimal.valueOf(this.radius)//
        .multiply(BigDecimal.valueOf(this.radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
  }

  public static double getArea2(double radius){
    return BigDecimal.valueOf(radius)//
        .multiply(BigDecimal.valueOf(radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
  }


  public static void main(String[] args) {
    // create circle object 
    // set radius 3.3
    // get radius
    // get diameter

    Circle c1 = new Circle();
    c1.setRadius(3.3);
    System.out.println(c1.getRadius());
    System.out.println(c1.getDiameter());
    System.out.println(c1.getArea());

  }
}
