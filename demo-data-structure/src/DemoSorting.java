import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {
    List<Passenger> passengers = new LinkedList<>();
    passengers.add(new Passenger(45));
    passengers.add(new Passenger(10));
    passengers.add(new Passenger(66));
    passengers.add(new Passenger(2));
    passengers.add(new Passenger(70));

    for (Passenger pas : passengers){
      System.out.println(pas);
    }
    //sort() -> merge sort (loop) -> Override compareTo
    Collections.sort(passengers);
    System.out.println(passengers);

    // Example: Arrays.sort
    Passenger[] passengerArr = new Passenger[] {new Passenger(45), new Passenger(10),new Passenger(66),new Passenger(2),new Passenger(70)};
    Arrays.sort(passengerArr);
    // Arrays.sort() -> object.compareTo
    System.out.println(Arrays.toString(passengerArr));

    // Comparator<Ball>
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.RED, 28));
    balls.add(new Ball(Color.YELLOW, 100));
    balls.add(new Ball(Color.BLUE, -4));
    balls.add(new Ball(Color.YELLOW, 250));
    Collections.sort(balls, new SortByValue());
    System.out.println(balls);

    // PriorityQueue
    Queue<Ball> bq = new PriorityQueue<>(new SortByColor());
  }
}
