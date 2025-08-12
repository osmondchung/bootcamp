import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    LocalDate yearEnd = LocalDate.of(1999, 12, 31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    LocalDate twoMonthsAfter = yearEnd.plusMonths(2L); // 2000-2-29

    System.out.println(twoMonthsAfter);
    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true
    // today
    LocalDate today = LocalDate.now();
    System.out.println(today);
    System.out.println(today.getDayOfWeek());

    System.out.println(today.getDayOfMonth());
    System.out.println(today.getDayOfYear());
    System.out.println(today.getMonthValue());

    System.out.println(today.isAfter(LocalDate.of(2025, 9, 11))); // is it before or after the provided date?
    System.out.println(today.isBefore(LocalDate.of(2025, 9, 11)));
    System.out.println(today.isEqual(LocalDate.of(2025, 9, 11)));

    System.out.println(today.getYear()); // 2025
    System.out.println(today.getMonth().ordinal()); // default Aug,

    
  }
}
