package abstraction;

public class Student extends Human {
  public Student(String name){
    super(name);
  }

  @Override 
  public void eat(){
    System.out.println("student " + super.getName() + " is eating");
  }
}
