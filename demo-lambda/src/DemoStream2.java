import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static class Employee{
    private String department;
    private int id;

    public Employee(int id, String department){
      this.department = department;
      this.id = id;
    }
    public String getDept(){
      return this.department;
    }
    public String toString(){
      return this.id + "  " + this.department;
    }
  }
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(101, "IT"));
    employees.add(new Employee(102, "MK"));
    employees.add(new Employee(103, "IT"));
    employees.add(new Employee(104, "HR"));
    employees.add(new Employee(105, "HR"));
    employees.add(new Employee(106, "HR"));
    // Group by department, number of employees
    Map<String,Long> deptMap = employees.stream()
      .collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
    System.out.println(deptMap);
    
    Map<String, Long> map2 = new HashMap<>();
    for (Employee ele : employees){
      map2.put(ele.getDept(), map2.getOrDefault(ele.getDept(), 0L) + 1L);
    }
    System.out.println(map2);

    // PartitioningBy
    Map<Boolean,List<Employee>> map3 = employees.stream()
      .collect(Collectors.partitioningBy(e -> ("IT").equals(e.getDept()) || ("MK").equals(e.getDept())));
    System.out.println(map3);

    // List<String> -> Map<String, Integer>
    List<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    Map<String,Integer> fruitMap = fruits.stream().collect(Collectors.toMap(e -> e, e-> e.length()));
    System.out.println(fruitMap);

    Stream<Integer> integers2 = Stream.of(10,9,-3,6);
    Stream<Integer> integers3 = Stream.of(10,9,-3,6);
    Stream<Integer> integers4 = integers3.filter(e -> e % 2 == 1);
    List<Integer> result = integers4.collect(Collectors.toList());
    System.out.println(result);

    // Stream -> filter, map, sort, distinct, collect
    // List -> stream()

    //
    boolean hasHegativeThree = integers2.anyMatch(e -> e == -3 || e ==6);
    System.out.println(hasHegativeThree);

    // FlatMap
    List<List<String>> namesList = new ArrayList<>();
    List<String> names1 = new ArrayList<>();
    List<String> names2 = new ArrayList<>();
    names1.add("John");
    names1.add("dasasf");
    names2.add("qw");
    names2.add("bgef");

    namesList.add(names1);
    namesList.add(names2);

    List<String> names = namesList.stream()
        .flatMap(list -> list.stream())
        .collect(Collectors.toList());
    System.out.println(names);

    List<Member> members = new ArrayList<>();
    Member m1 = new Member();
    m1.add("asfdsfd");
    m1.add("ad");
    Member m2 = new Member();
    m2.add("asda");
    m2.add("oni");
    members.add(m1);
    members.add(m2);
    // Approach 1: flatMap
    List<String> allAddresses = members.stream()
        .flatMap(m -> m.getAddresses().stream())
        .collect(Collectors.toList());
    System.out.println(allAddresses);

    // Approach 2: for loop + addAll()
    allAddresses = new ArrayList<>();
    for (Member member : members){
      allAddresses.addAll(member.getAddresses());
    }
    System.out.println(allAddresses);

    // Approach 3: nested loop + add()
    allAddresses = new ArrayList<>();
    for (Member member : members){
      for (String address : member.getAddresses()){
        allAddresses.add(address);
      }
    }
    System.out.println(allAddresses);
  }


  public static class Member{
    private List<String> addresses;

    public Member(){
      this.addresses = new ArrayList<>();
    }

    public boolean add(String address){
      return this.addresses.add(address);
    }
    public List<String> getAddresses(){
      return this.addresses;
    }
  }
}
