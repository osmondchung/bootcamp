package generic;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
  List<T> animals;
  
  public Zoo(){
    this.animals = new ArrayList<>();
  }
  public static void main(String[] args) {
    Zoo<Lion> lionzoo = new Zoo<>();
    
  }
}
