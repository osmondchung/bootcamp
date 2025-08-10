public class Loop {
  public static void main(String[] args){
    // if-else (program flow)
    int x = 2;
    //(;;) initializer; condition to continue; modifier
    for (int i = 0; i < 10; i++){
      System.out.println(x + " ");
      x *= 2;
    }
    // Step 1: int i = 0;
    // Step 2: i < 3 ? Yes (i = 0)
    // Step 3: print abc
    // Step 4: i++
    // Step 5: i < 3 ? yes (i = 1)
    // Step 6: print abc
    // Step 7: i++
    //  ...
    // Conclusion: the above loop executed 10 lines of codes

    int OddNum = 1;
    for (int i = 0; i < 5; i++){
      System.out.println(OddNum);
      OddNum += 2;
    }
    for (int i = 0; i < 10; i++){
      if (i % 2 == 1){
        System.out.println(i);
      }
    }

    // 2. 2^10
    int base = 2;
    for (int i = 0; i < 9; i++){
      base *= 2;
    }
    System.out.println(base);

    //3. 1 - 100, divided by 3 and divided by 10
    for (int i = 0; i < 101; i++){
      if (i % 3 == 0 && i % 10 == 0 && i != 0){
        System.out.println(i);
      }
    }

    // 4. Given a String, check if this String contains 'l' character
    String s1 = "halollll";
    int len = s1.length();
    for (int i = 0; i < len; i++){
      if (s1.charAt(i) == 'l'){
        System.out.println("It contains the letter l");
      } 
    }

    char targetCh = 'l';
    int counter = 0;
    boolean isFound = false;
    for (int i = 0; i < s1.length(); i++){
      if (s1.charAt(i) == targetCh){
        isFound = true;
        counter++;
      }
    }
    //if (isFound){
    if (counter > 0){
      System.out.println(targetCh + " is found");
      System.out.println(counter);
    }

    // print 1 - 10, even num only
    for (int i = 0; i < 10; i++){
      if (i % 2 == 0){
        System.out.println(i + 2);
      }
    }

    // continue
    // skip the rest and continue the loop
    for (int i = 0; i < 10; i++){
      if (i % 2 != 0){
        continue; // go to the next iteration -> i++
      }
      System.out.println(i + 2);
    }

    // break
    // exit the loop
    String name = "John";
    for (int i = 0; i < name.length(); i++){
      if (name.charAt(i) == 'J'){
        System.out.println("Yes");
        break;
      }
    }
    
    
  }
}
