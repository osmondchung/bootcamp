package enum1;

public class DemoRecursion {
  public static void main(String[] args) {
    sum(5, 10);
    System.out.println(sum(10));
    System.out.println(mul(9));

  }

  public static int sum(int value){
    if (value == 1) 
      return 1;
    return value + sum(value - 1);
  }

  public static int sum(int x, int y){
    return x + y;
  }

  public static int idk(int n){
    if (n < 2)
      return 0;
    return n % 2 == 1 ? mul(n - 1) : mul(n);
  }

  public static int mul(int n){
    if (n == 2)
      return 2;
    return n * mul(n - 2);
  }

}
