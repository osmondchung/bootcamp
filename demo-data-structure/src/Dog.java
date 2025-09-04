import java.util.Objects;

public class Dog {
  private String name;
  private int age;

  public Dog(String name, int age){
    this.name = name;
    this.age = age;
  }

  String getName(){
    return this.name;
  }

  int getAge(){
    return this.age;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.age);
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj) return true;
    if (!(obj instanceof Dog)) return false;
    Dog dog = (Dog) obj;
    return Objects.equals(this.name, dog.getName())
      && Objects.equals(this.age, dog.getAge());
  }

  @Override
  public String toString(){
    return this.name + " " + this.age;
  }
}
