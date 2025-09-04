public class Square extends Shape {
  private double length = 0.0;

  public Square(String color, double length){
    super(color);
    this.length = length;
  }

  public void setLength(double length){
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }

  public double area(){
    return this.length * this.length;
  }
}
