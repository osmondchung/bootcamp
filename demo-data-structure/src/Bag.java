// ClassName<T> -> attribute/ instance method's T

public class Bag<T> {
  private T value;

  public Bag(T value){
    this.value = value;
  }

  // T (not yet define) is similar to Object (defined)
  public T getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    // during compile time, we have to define T.
    // Generic Class -> reduce number of classes in the system
    Bag<String> bag = new Bag<>("hello");
    Bag<Ball> bag2 = new Bag<>(new Ball(Color.BLUE, 3));

    // Bag attributr Object vs Nag<T>
    
  }

}
