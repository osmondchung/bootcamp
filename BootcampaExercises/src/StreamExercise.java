package BootcampaExercises.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    System.out.println(numbers.stream().filter(n -> n %2 ==0).map(n -> n*n).collect(Collectors.toList()));

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // Output: [Alice, Annie, Alex]
    System.out.println(names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList()));

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5
    System.out.println(numbers2.stream().max(Integer::compare));
    System.out.println(numbers2.stream().min(Integer::compare));

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    System.out.println(words.stream().map(w -> w.length()).collect(Collectors.toList()));


    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    // List<String> words = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    System.out.println(words2.stream().filter(w -> w.length() > 3).count());


    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // Output: [15, 20]
    System.out.println(numbers3.stream().filter(n -> n > 10).collect(Collectors.toSet()));

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}
    Map<String, Integer> students = new HashMap<>();
    Student s1 = new Student("Alice", 85);
    Student s2 = new Student("Bob", 75);
    students.put(s1.getName(), s1.getScore());
    students.put(s2.getName(), s2.getScore());
    System.out.println(students);
    

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]
    Employee e1 = new Employee("John", 65000);
    Employee e2 = new Employee("Jane", 55000);
    Employee e3 = new Employee("Doe", 40000);
    List<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);
    System.out.println(employees.stream().filter(e -> e.getSalary() > 50000).map(e -> e.getName()).collect(Collectors.toList()));

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
    List<Person> people = Arrays.asList(
        new Person("Alice", 30),
        new Person("Bob", 25),
        new Person("Charlie", 30)
    );

    Map<Integer, List<String>> groupedByAge = people.stream()
        .collect(Collectors.groupingBy(
            Person::getAge,
            Collectors.mapping(Person::getName, Collectors.toList())
        ));

    System.out.println(groupedByAge);

    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)
    List<Staff> staffList = Arrays.asList(
        new Staff("Alice", Gender.Female),
        new Staff("Bob", Gender.Male),
        new Staff("Charlie", Gender.Male)
    );

    Map<Boolean, List<Staff>> partitionedByGender = staffList.stream()
        .collect(Collectors.partitioningBy(s -> s.getGender() == Gender.Male));
    System.out.println(partitionedByGender);

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]
    System.out.println(numbers4.stream().filter(n -> n > 10).map(n -> n * 2).collect(Collectors.toList()));

    // 12. Mapping to a Custom Object and Collecting to a List !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names10 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]
    List<Person> persons = names10.stream()
        .map(name -> new Person(name, defaultAge))
        .collect(Collectors.toList());
    System.out.println(persons);

    // 13. Mapping and Collecting to a Deque !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words10 = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)
    Deque<String> deque = words10.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toCollection(ArrayDeque::new));
    System.out.println(deque);

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]
    System.out.println(numbers6.stream().map(n -> n*n).collect(Collectors.toList()));

    // 15. Map and Reduce !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)
    List<Product> products = Arrays.asList(
    new Product("Book", 10),
    new Product("Pen", 5),
    new Product("Notebook", 7)
    );

    int totalPrice = products.stream()
        .map(Product::getPrice)
        .reduce(0, Integer::sum);

    System.out.println(totalPrice);

    // Output: 22

    // 16. Grouping. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}
    List<Worker> workers = Arrays.asList(
    new Worker("Alice", "HR"),
    new Worker("Bob", "IT"),
    new Worker("Charlie", "HR"),
    new Worker("David", "IT")
    );

    Map<String, List<String>> grouped = workers.stream()
        .collect(Collectors.groupingBy(
            Worker::getDepartment,
            Collectors.mapping(Worker::getName, Collectors.toList())
        ));
    System.out.println(grouped);

    // 17. Parallel Streams !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55
    System.out.println(numbers5.parallelStream().mapToInt(Integer::intValue).sum());

    // 18. FlatMap !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]
    System.out.println(
    listOfIntegers.stream()
        .flatMap(list -> list.stream())
        .filter(n -> n > 5)
        .collect(Collectors.toList())
    );
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]
    System.out.println(fruits.stream().distinct().sorted().collect(Collectors.toList()));
    
    // 20. Partitioning By !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}
    Children c1 = new Children("Alice", 45);
    Children c2 = new Children("Bob", 55);
    Children c3 = new Children("Charlie", 40);
    Children c4 = new Children("David", 70);
    List<Children> children = new ArrayList<>();
    children.add(c1);
    children.add(c2);
    children.add(c3);
    children.add(c4);
    Map<Boolean, List<Children>> partitioned = children.stream()
    .collect(Collectors.partitioningBy(c -> c.getScore() >= 50));
    System.out.println(partitioned.toString());


    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
    System.out.println(languages.stream().collect(Collectors.joining(", ")));

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    System.out.println(ages.stream().filter(a -> a%3 == 0).findAny());
    System.out.println(ages.stream().filter(a -> a%3 == 0).findFirst());
    
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]
    System.out.println(elements.stream().skip(3).limit(5).collect(Collectors.toList()));
    
    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
    System.out.println(amounts.stream().map(a -> a*2).peek(a -> System.out.println(a)).collect(Collectors.toList()));

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty
    System.out.println(animals.stream().filter(s -> s.length() > 4).findFirst());
    System.out.println(animals2.stream().filter(s -> s.length() > 4).findFirst());


    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)
    System.out.println(duplicates.stream().collect(Collectors.toSet()));

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // 27. String Length Calculation 
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28
    System.out.println(keywords.stream().mapToInt(String::length).sum());


  }
  public static class Student{
    private String name;
    private int score;

    public Student(String name, int score){
      this.name = name;
      this.score = score;
    }

    public String getName(){
      return this.name;
    }
    public int getScore(){
      return this.score;
    }
  }

  public static class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary){
      this.name = name;
      this.salary = salary;
    }
    public String getName(){
      return this.name;
    }
    public int getSalary(){
      return this.salary;
    }
  }

  public static class Person{
    private String name;
    private int age;

    public Person(String name, int age){
      this.name = name;
      this.age = age;
    }
    public String getName(){
      return this.name;
    }
    public int getAge(){
      return this.age;
    }
  }

  public static class Children{
    private String name;
    private int score;

    public Children(String name, int score){
      this.name = name;
      this.score = score;
    }
    public String getName(){
      return this.name;
    }
    public int getScore(){
      return this.score;
    }
    @Override
    public String toString(){
      return "name= " + this.name;
    }
  }

  public static class Worker{
    private String name;
    private String department;

    public Worker(String name, String department){
      this.name = name;
      this.department = department;
    }
    public String getName(){
      return this.name;
    }
    public String getDepartment(){
      return this.department;
    }
  }
  public static class Product{
    private String name;
    private int price;;

    public Product(String name, int price){
      this.name = name;
      this.price = price;
    }
    public String getName(){
      return this.name;
    }
    public int getPrice(){
      return this.price;
    }
  }
  public enum Gender { Male, Female }

  public static class Staff {
    private String name;
    private Gender gender;

    public Staff(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() { return name; }
    public Gender getGender() { return gender; }
    @Override
    public String toString() { return name; }
  }
}