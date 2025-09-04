public class Example5 {
  public static void main(String[] args){
  ArrayTask task = new ArrayTask();
  Thread worker1 = new Thread(task);
  Thread worker2 = new Thread(task);

  worker1.start(); // execute task.run()
  worker2.start(); // execute task.run()

  try{
    // main thread will wait until worker1 come back
    worker1.join();
    // main thread will wait until worker2 come back
    worker2.join();
  } catch (InterruptedException e){
    
  }

  System.out.println(task.getArr()[0]); // 
  }
}
