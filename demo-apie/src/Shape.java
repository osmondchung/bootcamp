public abstract class Shape {
  private String color;

  public Shape(String color){
    this.color = color;
  }
  
  public abstract double area(); // abstract method: child class has to complete it
  
  public String getColor(){
    return this.color;
  }

  public static void main(String[] args) {
    Shape s1 = new Square("blue", 4.0);
    Shape c1 = new Circle("red", 3.0);
    System.out.println(s1.area());
    System.out.println(c1.area());
  }

}
