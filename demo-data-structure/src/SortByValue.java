import java.util.Comparator;

// write a class representing a sorting formula for a specific object
public class SortByValue implements Comparator<Ball> {
  @Override
  public int compare(Ball o1, Ball o2){
    return o1.getValue() > o2.getValue() ? -1 : 1;
  }
  
}
