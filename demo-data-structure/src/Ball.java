import java.util.PriorityQueue;
import java.util.Queue;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public Color getColor(){
    return this.color;
  }

  @Override
  public int compareTo(Ball ball){
    
    if (this.color == Color.RED)
      if(this.value > ball.value)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      if(this.value > ball.value)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1;
  }

  @Override
  public String toString(){
    return "Ball = " + this.color + " value= " + this.value;
  }

  public static void main(String[] args) {
    Queue<Ball> q1 = new PriorityQueue<>();
    Ball b1 = new Ball(Color.RED, 12);
    Ball b2 = new Ball(Color.BLUE, 13);
    Ball b3 = new Ball(Color.RED, 1);
    Ball b4 = new Ball(Color.RED, 100);
    Ball b5 = new Ball(Color.YELLOW, 53);
    Ball b6 = new Ball(Color.YELLOW, 73);
    Ball b7 = new Ball(Color.BLUE, 44);

    q1.add(b1);
    q1.add(b2);
    q1.add(b3);
    q1.add(b4);
    q1.add(b5);
    q1.add(b6);
    q1.add(b7);

    System.out.println(q1);
    while(!q1.isEmpty()){
      System.out.println(q1.poll());
    }
    
  }
}
