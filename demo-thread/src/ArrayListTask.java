import java.util.ArrayList;

public class ArrayListTask implements Runnable {
  private ArrayList<Integer> integers;

  public ArrayListTask(){
    this.integers = new ArrayList<>();
  }

  @Override
  public void run(){
    for (int i=0; i< 10000; i++){
      this.integers.add(1);
    }
  }

  public ArrayList<Integer> getIntArr(){
    return this.integers;
  }
}
