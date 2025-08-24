package bank;

import java.util.Arrays;
import java.util.Scanner;

public class DemoBank {
  public static void main(String[] args) {
    // Users A view bank account balance
    // User can credit/ debit his own account
    // User can fund transfer User B (produce transaction/history)
    // User can view all account transaction/ history
    // Assume only one bank with many users
    // A new user comes to open a new bank account
    // The bank account has its own account number

    Bank b1 = new Bank();
    b1.add(new Account(new User("john1234", "123")));
    b1.add(new Account(new User("lucas123", "234")));
    System.out.println(b1.findAccount("lucas123").getBalance());

    b1.findAccount("lucas123").credit(120);
    System.out.println(b1.findAccount("lucas123").getBalance());
    System.out.println(b1.findAccount("lucas123").debit(0));

    // Withdrawal (200)
    Scanner scanner = new Scanner(System.in);
    String accountUserName = "lucas1234";
    String accountUserPassword;
    String WorT;
    String amount;
    boolean isUserAccountValid = false;
    boolean isPasswordValid = false;
    Account userAccount = null;

    do {
      if (!isUserAccountValid){
        System.out.println("please enter a username");
        accountUserName = scanner.nextLine();
        userAccount = b1.findAccount(accountUserName);
        if (userAccount == null) { // check if userAccount is pointing to nothing
          System.out.println("User Account is not found.");
          continue;
        }
        else {
          isUserAccountValid = true;
        }
      }
      if (!isPasswordValid){
        System.out.println("please enter a password");
        accountUserPassword = scanner.nextLine();
        if (!userAccount.validatePassword(accountUserPassword)){
          System.out.println("password is incorrect");
          continue;
        } else {
          isUserAccountValid = true;
        }
      }

      // 2 Functions: Withdrawal or Fund Transfer (Auto-logout after either transaction)
      System.out.println("Withdrawal or Fund Transfer? Input 1 for Withdrawal; 2 for Fund Transfer.");
      WorT = scanner.nextLine();

      if (WorT.equals("1")){
        System.out.println("How much do u want to withdraw?");
        amount = scanner.nextLine();
        if (userAccount.debit(Integer.valueOf(amount))){
          System.out.println("withdrawal completed");
          break;
        } else {
          System.out.println("withdrawal amount exceed account balance");
          continue;
        }
      } else if (WorT.equals("2")){
        System.out.println("How much do u want to transfer?");
        amount = scanner.nextLine();

        if (userAccount.debit(Integer.valueOf(amount))){
          System.out.println("fund transfer completed");
          break;
        } else {
          System.out.println("transfer amount exceed account balance");
          continue;
        }
      } else {
        continue;
      }

    } while (true);
    scanner.close();


    /*User u1 = new User();
    Account a1 = new Account();
    Transaction t1 = new Transaction(100.0);
    Transaction t2 = new Transaction(350.0);

    a1.addtrans(t1);
    a1.addtrans(t2);
    System.out.println(a1.credit(t1.trans()));
    System.err.println(a1.debit(t2.trans()));*/
  }
}
