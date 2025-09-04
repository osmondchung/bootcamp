import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    //Deque<String> names = new PriorityQueue();
    Queue<String> names = new PriorityQueue<>();
    names.add("John");
    names.add("Steven");
    names.add("Lucas");
    names.add("Vincent");
    names.add("Cathy");

    // the ordering algorithm does not happen in add()
    System.out.println(names);

    // Priority Queue poll elements in given ordering
    // By default natural ordering (compareTo)
    System.out.println(names.poll()); // cathy
    System.out.println(names.poll()); // john

    names.add("Alex");
    System.out.println(names.poll()); 
    System.out.println(names.poll());
    
    // add() or poll() -> ordering?
    // ordering -> nlog

    Queue<Integer> nums = new PriorityQueue<>();
    nums.add(100);
    nums.add(-80);
    nums.add(800);
    nums.add(799);
    nums.add(20);

    System.out.println(nums);
    while (!nums.isEmpty()){
      System.out.println(nums.poll());
    }

    /*System.out.println(nums);
    System.out.println(nums.poll());
    System.out.println(nums);
    System.out.println(nums.poll());
    System.out.println(nums);*/


  }
}
