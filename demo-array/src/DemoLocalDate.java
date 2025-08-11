import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    LocalDate yearEnd = LocalDate.of(1999, 12, 31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true
    System.out.println(LocalDate.now());

  }
}
