import java.util.Vector;

public class VectorTask implements Runnable{
  private Vector<Integer> integers;

  public VectorTask(){
    this.integers = new Vector<>();
  }

  @Override
  public void run(){
    for (int i=0; i< 100000;i++){
      this.integers.addElement(1);
    }
  }

  public Vector<Integer> getVec(){
    return this.integers;
  }
}
