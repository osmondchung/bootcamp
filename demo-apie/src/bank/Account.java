package bank;

import java.math.BigDecimal;

// Designing!!!!!!!!!!!!! think about u want to use wt to find wt, wt to relate wt

// Account -> abstract
// Personal (hkid put to User) / Company (brCode put to CompanyInfo)
public class Account{
  private static int counter = 0; 
  private int id;
  private double balance = 0.0;
  private User user;
  private Transaction[] transactions;

  // fund transfer -> transaction
  

  public Account(User user){
    this.id = ++counter;
    this.balance = 0.0;
    this.user = user;
    this.transactions = new Transaction[0];
  }

  // 
  public boolean validatePassword(String inputtedPassword){
    return this.user.getPassword().equals(inputtedPassword);
  }


  public Transaction[] getTransactions(){
    return this.transactions;
  }

  public String getUserName(){
    return this.user.getUserName();
  }

  // method to record transaction to history
  public void addTrans(Transaction transaction){
    Transaction[] transactions = new Transaction[this.transactions.length +1];
    for (int i = 0; i < this.transactions.length; i++){
      transactions[i] = this.transactions[i];
    }
    transactions[transactions.length - 1] = transaction;
    this.transactions = transactions;
  }

  public double getBalance(){
    return this.balance;
  }

  public void credit(double amount){
    if (amount <= 0)
      return;
    this.balance = BigDecimal.valueOf(this.balance).add(BigDecimal.valueOf(amount)).doubleValue();
    this.addTrans(new Transaction(this.id, -1, amount));
  }

  public boolean debit(double amount){
    if (amount <= 0)
      return false;
    if (amount > this.balance)
      return false;
    this.balance -= amount;
    this.addTrans(new Transaction(this.id, -1, amount * -1));
      return true;
  }

  // account.fundtransfer(anotherAccount)
  public boolean fundTransfer(Account toAccount, double amount){
    if (amount <= 0 || !this.debit(amount) || toAccount == null) //// !!!!!!!!!!!!!!!
      return false;
    toAccount.credit(amount);
      return true;
  }





}
