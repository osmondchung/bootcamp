import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    //BigDecimal bd1 = new BigDecimal(0.1); // wrong 
    //BigDecimal bd2 = new BigDecimal(0.2);
    BigDecimal bd3 = bd1.add(bd2);
    //System.out.println(bd3.doubleValue()); // 0.3

    // this one better form
    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal bd5 = BigDecimal.valueOf(0.3);
    BigDecimal bd6 = bd4.add(bd5);
    //System.out.println(bd6);

    // + add()
    // - subtract()
    // * multiply()
    // / divide(), non-terminating decimal, rounding

    BigDecimal bd7 = bd4.add(bd5);
    BigDecimal bd8 = bd4.subtract(bd5);
    BigDecimal bd9 = bd4.multiply(bd5);
    // HALF_UP -> 0.5 or above, round up
    // HALF_DOWN -> 0.5 or below, round down
    BigDecimal bd10 = bd4.divide(bd5, 2, RoundingMode.HALF_UP);
    BigDecimal bd11 = bd4.divide(bd5, 2, RoundingMode.HALF_DOWN);
    BigDecimal bd12 = bd4.divide(bd5, 2, RoundingMode.HALF_EVEN);


    //BigDecimal bd10 = bd4.divide(bd5);
    
    System.out.println(0.1 + 0.3);
    System.out.println(bd7.doubleValue());
    System.out.println(0.3 - 0.1); // 0.19999999999999998
    System.out.println(bd8.doubleValue());
    System.out.println(0.1 * 0.3);
    System.out.println(bd9.doubleValue());
    System.out.println(0.1 / 0.3); // 0.33333333333333337
    System.out.println(bd10.doubleValue());
    System.out.println(bd11.doubleValue());
    System.out.println(bd12.doubleValue());

  }
}
