package abstraction;

public class Animal implements Survivable {

  
  @Override
  public void eat(){
    
  }
  @Override
  public void drink(){
    
  }
  @Override
  public void sleep(){

  }

  public static void main(String[] args) {
    Survivable[] animals = new Survivable[3];

    for (Survivable animal: animals){
      animal.drink();
      animal.eat();
      animal.sleep();
    }
  }
}
