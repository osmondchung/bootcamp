package BootcampaExercises.src;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class DataStructureExercise2 {
  public static void main(String[] args) {
    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    // 1c. Print the head of the queue without removing it.
    // 1d. Remove two elements from the queue.
    // 1e. Print the remaining queue and its size.
    Queue<Integer> intQ = new LinkedList<>();
    intQ.add(5);
    intQ.add(10);
    intQ.add(15);
    intQ.add(20);
    intQ.add(25);
    System.out.println(intQ.peek());
    System.out.println(intQ.poll());
    System.out.println(intQ.poll());
    System.out.println("Queue= " + intQ + " size= " + intQ.size());


    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    // 2b. Serve (remove) the first two customers.
    // 2c. Print the remaining customers in the queue.
    // 2d. Add two new customers: "Eva", "Frank".
    // 2e. Write a method that processes the queue until it is empty, printing each served customer.
    Queue<String> strQ = new LinkedList<>();
    strQ.add("Alice");
    strQ.add("Bob");
    strQ.add("Charlie");
    strQ.add("David");
    strQ.remove();
    strQ.remove();
    System.out.println(strQ);
    strQ.add("Eva");
    strQ.add("Frank");
    while (!strQ.isEmpty()){
      System.out.println(strQ.poll());
    }


    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.
    System.out.println(isPalindrome("hello"));


    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    // 4b. Simulate "back" and "forward" navigation using deque operations.
    // 4c. Print the current page after each operation.
    Deque<String> browHist = new ArrayDeque<>();
    browHist.add("google.com");
    browHist.add("facebook.com");
    browHist.add("youtube.com");
    browHist.add("github.com");
    boolean forward = false;
    System.out.println(forwardback(browHist, forward));


    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // 5b. The method should split the text by spaces and count occurrences of each word.
    // Example input: "apple banana apple orange banana apple"
    // Output: {apple=3, banana=2, orange=1}
    // 5c. Print the word with the highest frequency.
    HashMap<String, Integer> hm = new HashMap<>();
    System.out.println(countWordFrequency("apple banana apple orange banana apple"));


    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    // 6b. Write a method to search for a student by ID.
    // 6c. Write a method to remove a student by ID.
    // 6d. Print all student names in alphabetical order.
    HashMap<Integer, Student> hm2 = new HashMap<>();
    hm2.put(1, new Student(1, "Alice"));
    hm2.put(2, new Student(2, "Bob"));
    hm2.put(3, new Student(3, "Charlie"));
    hm2.put(4, new Student(4, "David"));
    System.out.println(getStudent(hm2, 1));
    System.out.println(removeStudentById(hm2, 1));
    printStudentNamesAlphabetically(hm2);

    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    // 7c. Print the inversed map.
    HashMap<String, String> hm3 = new HashMap<>();
    hm3.put("USA", "Washington");
    hm3.put("France", "Paris");
    hm3.put("Japan", "Tokyo");
    hm3.put("India", "Delhi");
    HashMap<String, String> inverseMap = new HashMap<>();
    for (String country : hm3.keySet()) {
        String capital = hm3.get(country);
        inverseMap.put(capital, country);
    }
    System.out.println("Inverse map (capital -> country): " + inverseMap);


    
     // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    // 8b. Add:
    //      "Alice" -> ["Math", "Science"]
    //      "Bob" -> ["History"]
    //      "Charlie" -> ["Math", "English"]
    // 8c. Add "English" to Bob’s subjects.
    // 8d. Print each student with their subjects.
    // 8e. Write a method to return all students taking "Math".
    // In your main method, after previous exercises:
    HashMap<String, ArrayList<String>> hm5 = new HashMap<>();
    hm5.put("Alice", new ArrayList<>(List.of("Math", "Science")));
    hm5.put("Bob", new ArrayList<>(List.of("History")));
    hm5.put("Charlie", new ArrayList<>(List.of("Math", "English")));

    // 8c. Add "English" to Bob’s subjects.
    hm5.get("Bob").add("English");

    // 8d. Print each student with their subjects.
    for (String student : hm5.keySet()) {
        System.out.println(student + " -> " + hm5.get(student));
    }

    // 8e. Method to return all students taking "Math"
    System.out.println("Students taking Math: " + studentsTakingSubject(hm5, "Math"));

  }

  public static boolean isPalindrome(String word){
    Deque<Character> charDeq = new ArrayDeque<>();
    for (char chr : word.toCharArray()){
      charDeq.add(chr);
    }
    while (charDeq.size() > 1){
      if (charDeq.removeFirst() != charDeq.removeLast())
        return false;
    }
    return true;
  }

  public static HashMap<String, Integer> countWordFrequency(String text){
    HashMap<String, Integer> hm = new HashMap<>();
    String[] words = text.split(" ");
    for (String word : words) {
        hm.put(word, hm.getOrDefault(word, 0) + 1);
    }
    // Find and print the word with the highest frequency
    String maxWord = null;
    int maxCount = 0;
    for (String word : hm.keySet()) {
        if (hm.get(word) > maxCount) {
            maxCount = hm.get(word);
            maxWord = word;
        }
    }
    System.out.println("Most frequent word: " + maxWord + " (" + maxCount + ")");
    return hm;
}
  /*public static HashMap<String, Integer> countWordFrequency(String text){
    HashMap<String, Integer> hm = new HashMap<>();
    String[] idk = text.split(" ");
    for (String ele : idk){
      hm.put(ele, hm.getOrDefault(idk, null));
    }
    return hm;
  }*/

  public static void printStudentNamesAlphabetically(HashMap<Integer, Student> hm) {
    List<String> names = new ArrayList<>();
    for (Student s : hm.values()) {
        names.add(s.getName());
    }
    names.sort(String::compareTo);
    System.out.println("Students in alphabetical order: " + names);
}

  public static String forwardback(Deque<String> browHist, boolean forward){
    if (forward){
      browHist.addLast(browHist.poll());
    } else {
      browHist.addFirst(browHist.pollLast());
    }
    return browHist.poll();
  }

  //Q6
  public static Student getStudent(HashMap<Integer, Student> hm, int id){
    return hm.get(id);
  }

  public static Student removeStudentById(HashMap<Integer, Student> hm, int id){
    return hm.remove(id);
  }


// Add this method to your class (outside main):
  public static ArrayList<String> studentsTakingSubject(HashMap<String, ArrayList<String>> hm, String subject) {
    ArrayList<String> result = new ArrayList<>();
    for (String student : hm.keySet()) {
        if (hm.get(student).contains(subject)) {
            result.add(student);
        }
    }
    return result;
}

  public static class Student {
    private int id;
    private String name;

  public Student(int id, String name){
    this.id = id;
    this.name = name;
  }


  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }
    // Constructor, getters, setters, toString
      @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Student))
      return false;
    Student student = (Student) obj;
    return Objects.equals(this.id, student.getId())
      && Objects.equals(this.name, student.getName());
  }
  
  @Override 
  public int hashCode(){
    return Objects.hash(this.id, this.name);
  }

  @Override
  public String toString(){
    return "student ID= " + this.id + " student name= " + this.name;
  }
  }

  
}