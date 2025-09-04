package generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();

  public static double totalArea(List<Shape> shapes){
    double total=0.0;
    for (Shape shp : shapes){
      total += shp.area();
    }
    return total;
  }

  public static <T extends Shape> double totalArea2(List<T> shapes){
    double total=0.0;
    for (Shape shp : shapes){
      total += shp.area();
    }
    return total;
  }
  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));
    circles.add(new Circle(4));
    //totalArea(circles); error, coz List<Shape> has no relationship with List<Circle>
    totalArea2(circles);
  }
}
