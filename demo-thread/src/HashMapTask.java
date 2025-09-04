import java.util.HashMap;

public class HashMapTask implements Runnable {
  private HashMap<String, Integer> map;

  public HashMapTask(){
    this.map = new HashMap<>();
  }

  @Override
  public synchronized void run(){
    for (int i=0; i< 10000; i++){
      this.map.put("apple",this.map.getOrDefault("apple", 0) + 1);
    }
  }

  public HashMap<String, Integer> getHM(){
    return this.map;
  }
}

