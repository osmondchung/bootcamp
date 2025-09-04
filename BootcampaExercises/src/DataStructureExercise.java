package BootcampaExercises.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    List<Integer> intArrList = new ArrayList<>();
    intArrList.add(10);
    intArrList.add(20);
    intArrList.add(30);
    intArrList.add(40);
    intArrList.add(50);
    System.out.println(intArrList);
    intArrList.remove(2);
    System.out.println(intArrList.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    List<String> strArrList = new ArrayList<>();
    strArrList.add("Apple");
    strArrList.add("Banana");
    strArrList.add("Mango");
    strArrList.add("Orange");
    boolean grapeIsExist = strArrList.contains("Grapes");
    System.out.println(grapeIsExist);
    if (!grapeIsExist){
      strArrList.add("Grapes");
    }
    System.out.println(strArrList);
    strArrList.add(2, "Peach");
    strArrList.remove(3);
    System.out.println(strArrList);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    List<Integer> intArrList2 = new ArrayList<>();
    intArrList2.add(10);
    intArrList2.add(20);
    intArrList2.add(10);
    intArrList2.add(30);
    intArrList2.add(40);
    intArrList2.add(20);
    intArrList2.add(50);
    HashSet<Integer> hs = new HashSet<>();
    for (int ele : intArrList2){
      hs.add(ele);
    }
    System.out.println(hs);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> strHs = new HashSet<>();
    strHs.add("USA");
    strHs.add("India");
    strHs.add("China");
    strHs.add("Japan");
    strHs.add("Canada");
    strHs.add("India");
    System.out.println(strHs);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> intHs = new HashSet<>();
    intHs.add(1.1);
    intHs.add(2.2);
    intHs.add(3.3);
    intHs.add(4.4);
    intHs.add(5.5);
    System.out.println(intHs.contains(3.3));
    intHs.remove(2.2);
    System.out.println(intHs);

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);
    HashSet<Integer> common = new HashSet<>(set1); // Create a new set with elements of set1
    common.retainAll(set2);
    System.out.println(common);
    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet<String> strHs2 = new HashSet<>();
    strHs2.add("Cherry");
    strHs2.add("Steve");
    strHs2.add("Chole");
    strHs2.add("Jenny");
    strHs2.add("Vicky");
    ArrayList<String> strArrList3 = new ArrayList<>();
    for (String ele : strHs2){
      strArrList3.add(ele);
    }
    System.out.println(strArrList3);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    System.out.println(students);
    students.remove(1);
    System.out.println(students);
    
    ArrayList<Student> studentA = new ArrayList<>();
    for (Student student: students){
      if (student.getName().startsWith("A")){
        studentA.add(student);
      }
    }
    System.out.println(studentA);

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Student> studentSet1 = new HashSet<>();
    HashSet<Student> studentSet2 = new HashSet<>();
    studentSet1.add(new Student(1, "Alice"));
    studentSet1.add(new Student(2, "Bob"));
    studentSet1.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(2, "Bob"));
    studentSet2.add(new Student(3, "Charlie"));
    studentSet2.add(new Student(4, "David"));

    HashSet<Student> common2 = new HashSet<>(studentSet1);
    common2.retainAll(studentSet2);
    System.out.println(common2);

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name){
      this.id = id;
      this.name = name;
    }
    // getter, setter, etc.
    public String getName(){
      return this.name;
    }

    public int getId(){
      return this.id;
    }

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

      // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
  public static String searchName(ArrayList<Student> students, int id){
    for (Student student : students){
      if (id == student.getId())
        return student.getName();
    }
    return "Student not Found";
  }
  }
}