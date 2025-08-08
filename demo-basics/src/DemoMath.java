public class DemoMath {
  public static void main(String[] args) {
    /*int x = 5;
    int y = 9;
      
    System.out.println(x+y);

    int z = x + y;
    System.out.println(z);
    System.out.println("z=" + z);


    double a = 3.8;
    double b = 4.2;
    double c = a - b;
    System.out.println(c);

    int h = 40;
    int u = 3;
    int result = h * u;
    System.out.println(result);

    double i = 9;
    double j = 2;
    double p = 4;
    double divided_result = i / j;
    double divided_result2 = i / p;
    System.out.println(divided_result);
    System.out.println(divided_result2);*/

    // int/ int -> int 
    // Approach 1:
    double d2 = 9.0 / 2;
    // step 1: 9.0 / 2 (double / int -> double) -> 4.5
    // step 2: put 4.5 (double) into double type -> 4.5
    System.out.println(d2);

    // double type is higher than int type in Java
    // cannot assign a higher level type value into a lower level type of variable

    double d5 = 2;// this can
    // auto-convert (auto-upgrade from int to double for the value)
    //int i1 = 9.0 / 2.0;        //this cannot!
    System.out.println(d5);

    // remainder %
    int i2 = 10 / 3;
    System.out.println(i2);

    int i3 = 10 % 3;
    System.out.println(i3);

    int i4 = 6 + 8 * 3;
    System.out.println(i4);

    int i5 = (6 + 8) * 3;
    System.out.println(i5);

    
  }
}