public class Student {
  private int age;

  public Student(int age){
    this.age = age;
  }

  // Outer class cannot read inner class attributes
  // But inner class can read outer class attributes
  /*public String collegeInfo(){
    return "College name=" + name;
  }*/

  // exist, but useless!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
  public int sum(int x, int y){

    class Calculator{
      private int x;
      private int y;

      Calculator(int x, int y){
        this.x = x;
        this.y = y;
      }

      public int sum(){
        return this.x + this.y;
      }
    }
    return new Calculator(x, y).sum();
  }

  public class College{
    private String name;

    public College(String name){
      this.name = name;
    }

    public String studentInfo(){
      return "student age+ " + age + "College name= " + name;
    }
  }

}
