import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  private double height;
  private double weight;
  private double bmi;

  public void setHeight(double height){
    this.height = height;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public double getHeight(){
    return BigDecimal.valueOf(this.height).doubleValue();
  }

  public double getWeight(){
    return BigDecimal.valueOf(this.weight).doubleValue();
  }

  public double getBmi(){
    BigDecimal bd = BigDecimal.valueOf(this.height)//
      .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight)//
        .divide(bd, 2, RoundingMode.HALF_UP)//
        . doubleValue();
  }

  public double getBmi(int scale, RoundingMode roundingMode){
    BigDecimal bd = BigDecimal.valueOf(this.height)//
      .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight)//
        .divide(bd, scale, roundingMode)//
        . doubleValue();
  }

  // Method: isOverweight, return boolean, bmi > 30
  public boolean isOverweight(){
    return this.getBmi() > 30;
  }

  public static void main(String[] args){
    Human h1 = new Human();
    h1.setHeight(1.76);
    h1.setWeight(100.0);
    h1.getHeight();
    h1.getWeight();
    h1.getBmi();
    System.out.println(h1.getBmi());
    System.out.println(h1.getBmi(3, RoundingMode.HALF_UP));
    System.out.println(h1.isOverweight());
  }

}
