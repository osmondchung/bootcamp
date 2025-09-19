public class DemoSwitchExpression {

  public static enum Color {
    RED, YELLOW, BLUE,;
  }

  public static class Ball{
    private Color color;

    public Ball(Color color){
      this.color = color;
    }

    public Color getColor(){
      return this.color;
    }
  }
  public static void main(String[] args) {
    // Java 14
    // switch -> enum
    Ball b1 = new Ball(Color.BLUE);
    switch (b1.getColor()) {
      case RED:
        System.out.println("RED");
        break;
      case BLUE:
        System.out.println("BLUE");
        break;
      case YELLOW:
        System.out.println("YELLOW");
        break;
    }

    // Java 14 Switch Expression (Lambda)
    switch (b1.getColor()) {
      case RED -> System.out.println("RED");
      case BLUE -> System.out.println("BLUE");
      case YELLOW -> System.out.println("YELLOW");
    }

    // able to return value /object
    // yield -> similar to "return", specific for switch expression
    // "return" is just for method use.
    int result = switch (b1.getColor()) {
      case RED -> {yield 1;}
      case BLUE -> {yield 2;}
      case YELLOW -> {yield 3;}
    };

    int result2 = switch (b1.getColor()) {
      case RED -> 1;
      case BLUE -> 2;
      case YELLOW -> 3;
    };
    System.out.println(result);
    System.out.println(result2);

    MathOperation operation = switch (b1.getColor()){
      case RED -> {
        yield (x, y) -> x + y;
      }
      case BLUE -> {
        yield (x, y) -> x - y;
      }
      case YELLOW -> {
        yield (x, y) -> x * y;
      }
    };
    System.out.println(operation.operate(10,3));
  }
}
