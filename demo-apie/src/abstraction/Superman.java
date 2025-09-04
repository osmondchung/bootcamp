package abstraction;

// Class name "implements" Interface name
// Interface control the child class method availability at compile time
public class Superman extends Human implements Flyable{
  public Superman(String name){
    super(name);
  }

  // Skill
  @Override
  public void fly(){
    System.out.println("superman " + super.getName() + " is flying");
  }

  @Override
  public void eat(){
    System.out.println("Superman " + super.getName() + " is eating");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("sup");
    s1.fly();
    s1.eat();
    Superman s2 = new Superman("nia");
    s2.fly();
    s2.eat();

    // Polymorphism
    // "Hide" Superman Object "Skill"
    Flyable superman = new Superman("leo");
    superman.fly();
    // superman.eat(); // Compile-time Polymorphism, checking type of object
    // superman object has eat()? Yes
    // "Unhide" Superman Object all skills
    Superman superman2 = (Superman) superman;
    System.out.println(superman2.getName());

    Human superman3 = new Superman("sue");
    superman3.eat();
    System.out.println(superman3.getName());

    // 
    Eatable[] humans = new Eatable[3];
    humans[0] = new Student("oscar");
    humans[1] = new Student("tim");
    humans[2] = new Student("ben");

    for (Eatable human : humans){
      human.eat();
    }

    
  }
}