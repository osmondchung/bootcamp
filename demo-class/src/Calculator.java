public class Calculator {
  private int x;
  private int y;

  // constructor
  public Calculator(int x, int y){
    this.x = x;
    this.y = y;
  }

  // getter
  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  // sum()
  public int sum(){
    return this.x + this.y;
  }

  public static int sum(int x, int y){
    return x + y;
  }

  public static void main(String[] args) {
    // 10, 7 are the attributes of the object, and call the method on the object
    System.out.println(new Calculator(10, 7).sum());
    // just put 10, 7 value into the method
    System.out.println(Calculator.sum(10, 7));
  }

}
