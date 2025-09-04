public class StringTask implements Runnable {
  private String str = "";

  @Override
  public synchronized void run(){
    for (int i=0; i< 10000; i++){
      this.str += "a";
    }
  }

  public String getStr(){
    return this.str;
  }
}
