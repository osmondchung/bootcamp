import java.util.PriorityQueue;
import java.util.Queue;


public class Passenger implements Comparable<Passenger>{
  private int age;
  private boolean isMale;
  private boolean isVip;

  public Passenger(int age){
    this.age = age;
    this.isMale = isMale;
    this.isVip = isVip;
  }

  public int getAge(){
    return this.age;
  }

  public boolean getGender(){
    return this.isMale;
  }

  public boolean getVip(){
    return this.isVip;
  }

  public boolean isElderly(){
    return this.age > 65;
  }

  @Override
  public int compareTo(Passenger passenger){
    if (this.isElderly() && !passenger.isElderly()) return -1;
    if (!this.isElderly() && !passenger.isElderly()) return 1;
    if (this.isElderly() && !passenger.isElderly()) {
      if (this.age < passenger.getAge())
        return -1;
      else
        return 1;
    }
    if (this.age < passenger.getAge())
      return -1;
    return 1;
  }


  @Override
  public String toString(){
    return "passenger age = " + this.age;
  }

  public static void main(String[] args) {
    Queue<Passenger> pq = new PriorityQueue<>();
    pq.add(new Passenger(4));
    pq.add(new Passenger(66));
    pq.add(new Passenger(78));
    pq.add(new Passenger(18));
   //pq.add(new Passenger(67));

    System.out.println(pq);

    System.out.println(pq.poll());
    System.out.println(pq.poll());

    pq.add(new Passenger(69));
    pq.add(new Passenger(68));
    System.out.println(pq);
    System.out.println(pq.poll());

  }
}
