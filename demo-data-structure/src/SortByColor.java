import java.util.Comparator;

public class SortByColor implements Comparator<Ball>{
  @Override
  public int compare(Ball o1, Ball o2){
    if (o1.getColor() == Color.RED)
      if(o1.getColor() > o2.color)
      return -1;
    if (o2.getColor() == Color.RED)
      return 1;
    if (o1.getColor() == Color.YELLOW)
      if(this.value > ball.value)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1;
  }
}
