public class Student {
  private static int score = 100;
  private String name;
  private String id;

  // Instance method
  // this. this instance's things
  public Student(String name, String id){
    this.name = name;
    this.id = id;
  }

  // Instance method
  public int calculate(int x, int y){
    return x + y + this.name.length();
  }

  // You Can/SHould use static here, coz u didnt use object attribute for processing.
  // Static method 
  // static method can be called without object
  public static int calculate2(int x, int y){
    return x + y;
  }
  
  public int namelength(){
    return this.name.length();
  }

  public void setName(String name){
    this.name = name;
  }

  public void setId(String id){
    this.id = id;
  }

  public String getName(){
    return this.name;
  }

  public String getId(){
    return this.id;
  }

  public String toString(){
    return "Student" + "("
      + "name=" + this.name
      + ", id=" + this.id
      + ")";
  }

  public static void main(String[] args) {
    Student s1 = new Student("Alice", "S001");
    Student s2 = new Student("Bob", "S002");
    System.out.println(s1);
    System.out.println(s2);

    System.out.println(s1.calculate(5, 10));
    System.out.println(s2.calculate(5, 10));
    
    // the way to call static method, use the class name to call static method
    System.out.println(Student.calculate2(5, 10));

  }
}
