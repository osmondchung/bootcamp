import java.util.Objects;

public class Cat {
  private String name;
  private int age;

  public Cat(String name){
    this.name = name;
  }

  public Cat(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.age);
  }

  @Override 
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (!(obj instanceof Cat)) return false;
    Cat cat = (Cat) obj;
    return Objects.equals(this.name, cat.getName())
      && Objects.equals(this.age, cat.getAge());
  }
  
 @Override 
  public String toString(){
   return this.name + " " + this.age;
  }
}