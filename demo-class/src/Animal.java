import java.time.LocalDate;
import java.time.LocalDateTime;

public class Animal {
  // Attribute
  private LocalDate dob;
  

  // Method -> input (optional) -> output (optional)
  // void -> no return type
  public void setDob(LocalDate dob){
    this.dob = dob;
  }

  // Method return type: LocalDate
  public LocalDate getDob(){
    return this.dob;
  }

  public static void main(String[] args){
    // Person
    Person p1 = new Person();
    p1.setAge(30);
    System.out.println(p1.getAge());

    // Animal object
    Animal vincent = new Animal();
    vincent.setDob(LocalDate.of(2020, 10, 9));
    LocalDate vincentdob = vincent.getDob();
    System.out.println(vincentdob);

    vincent.setDob(LocalDate.of(2021, 11,2));
    System.out.println(vincent.getDob());
    System.out.println(vincentdob);

    Animal lucas = new Animal();
    lucas.setDob(LocalDate.of(2021, 11, 2));
    System.out.println(lucas.getDob());

    // address (lucas and vincent)
    lucas = vincent;
    lucas.setDob(LocalDate.of(2024, 12, 31));
    System.out.println(vincent.getDob());
    System.out.println(lucas.getDob());

  }


}
