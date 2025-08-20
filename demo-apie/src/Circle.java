import java.math.BigDecimal;

public class Circle extends Shape{
  private double radius = 0.0;

  public Circle(String color, double radius){
    super(color);
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
    //return this.radius * this.radius * Math.PI;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }



  
}
