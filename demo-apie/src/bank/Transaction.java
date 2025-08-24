package bank;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Transaction {
  private static int idCounter = 0;
  private int id;
  private int fromAccount;
  private int toAccount;
  private double transAmount = 0.0;
  private String description;
  private LocalDateTime tranDateTime;

  //private String description;

  public Transaction(int fromAccount, int toAccount, double transAmount){
    this.id = ++idCounter;
    this.fromAccount = fromAccount;
    this.toAccount = toAccount;
    this.transAmount = transAmount;
    this.description = description;
    this.tranDateTime = LocalDateTime.now();
  }

  public double trans(){
    return this.transAmount;
  }


  
}
