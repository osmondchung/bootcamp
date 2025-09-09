import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    // Anonaymous Approach
    // this approach can be for all interfaces, more than ONE method
    Eatable student  = new Eatable(){
      @Override
      public void eat(){
        System.out.println("Human is able to eat");
      }
    };

    // Lambda Approach
    // "()": Functional Interface method signature (i.e. eat())
    // "->": u are going to implement method content for eat() method
    // this approach is only for Functional Interface (ONE Method)
    Eatable human = () -> {
      System.out.println("Human is able to eat");
    };
    human.eat();

    // Lambda Syntax
    // 1. skip brackets when there is only one line of code
    // 2. skip "return" keyword when there is one line only
    // 3. skip the parameter type
    Eatable human2 = () -> System.out.println("Human is able to eat");
    human2.eat();

    MathOperation sumFormula = (x, y) -> x + y;
    System.out.println(sumFormula.operate(10,3));

    MathOperation subFormula = (x, y) -> x - y;
    System.out.println(subFormula.operate(10, 3));

    MathOperation maxFormula = (x, y) -> {
      if (x > y)
        return x;
      return y;
    };
    System.out.println(maxFormula.operate(10, 3));

    MathOperation minFormula = (x, y) -> x < y ? x : y;
    System.out.println(minFormula.operate(10, 3));

    // Java Built-in funtional interface
    // R apply(T t);
    // 1. Function (one input -> one output)
    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("hello"));

    // 2. BiFunction (two inputs -> one output)
    BiFunction<Integer, Integer, Integer> multiplyFormula = (x, y) -> x * y;
    System.out.println(multiplyFormula.apply(10, 3));

    // 3. Consumer 
    // oid accept(T t)
    Consumer<String> stringPrinter = s -> System.out.println(s + "hello");
    stringPrinter.accept("John");

    // 4. BiConsumer (void method)
    BiConsumer<String, String> longerStringFormula = (s1, s2) -> {
      if (s1.length() > s2.length()){
        System.out.println(s1);
        return;
      }
      System.out.println(s2);
    };
    longerStringFormula.accept("hello", "steven");

    // 5. Supplier (0 input -> 1 output)
    // Random number generator (1-100)
    // T get()
    Supplier<Integer> ranNum = () -> new Random().nextInt(100) + 1;
    System.out.println(ranNum.get());

    // 6. Predicate (boolean fomula)
    // age > 65 
    Predicate<Person> elderlyDefinition = p -> p.getAge() > 65;
    System.out.println(elderlyDefinition.test(new Person(66)));
    System.out.println(elderlyDefinition.test(new Person(64)));

    BiPredicate<Person, Person> twoPersonDefinition = (p1, p2) -> p1.getAge() > 65 && p2.getAge() > 65;
    System.out.println(twoPersonDefinition.test(new Person(66), new Person(44)));

  }

  public static class Person{
    private int age;

    public Person(int age){
    this.age = age;
    }

    public int getAge(){
      return this.age;
    }
  }


}
