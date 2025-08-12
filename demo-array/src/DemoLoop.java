import java.util.Arrays;

public class DemoLoop {
  public static void main(String[] args) {
    String[] names = new String[] {"John", "Petter", "Sally"};
    for (int i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }
    System.out.println(Arrays.toString(names));

    // for each loop
    // Syntax: for (variable name : array name)
    for (String name : names){
      System.out.println(name);
    }

    char[] characters = new char[] {'a', 'b', 'c', 'i', 'j', 'k'};
    for (char chs : characters){
      System.out.println(chs);
    }

    // New string method: toCharArray()
    char[] character2 = "hello".toCharArray();
    for (char chs : character2){
      System.out.println(chs);
    }

    // hello -> olleh
    String str = "hello";
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--){ // WOW
      newStr += str.charAt(i);
    }
    System.out.println(newStr);

    // given int 532 -> 5+3+2 -> 10
    int number = 532;
    int newnum = 0;
    int n = 3;
    while (n > 0) {
      number -= newnum;
      newnum += number % 10;
      n--;
    }
    System.out.println(newnum);

    // Find Max Min
    int[] arr = new int[] {400, 230, 100, -50, 4, 9};
    int max = arr[0];
    int min = arr[0];
    int sum = 0;
    double avg = 0.0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
      }
      if (arr[i] < min){
        min = arr[i];
      }
      sum += arr[i];
    }
    avg = (double) sum/ arr.length; // !!!!!!!!!!!!!!!!!
    System.out.println("max:" + max);
    System.out.println("min:" + min);
    System.out.println(sum);
    System.out.println(avg);

    // swap
    int a = 10;
    int b = 20;
    int temp = 0;
    temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);

    // 1. moving elements
    //int temp2 = arr[0];
    for (int i = 0; i < arr.length - 1; i++){
      temp = arr[i];
      arr[i] = arr[i+1];
      arr[i + 1] = temp;
    }
    //arr[arr.length - 1] = temp2;
    //System.out.println(Arrays.toString(arr));

    // 2. Move the max value to the tail
     int max1 = arr[0];
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i] > arr[i + 1]){
        max1 = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = max1;
      }
    }
    //System.out.println(Arrays.toString(arr));

    // 3. Sorting
    // Asc
    for (int j = 0; j < arr.length - 1; j++){ // ith of time to moving max
      for (int i = 0; i < arr.length - j - 1; i++){ // jth index for moving max value
        if (arr[i] > arr[i + 1]){
          max1 = arr[i];
          arr[i] = arr[i+1];
          arr[i + 1] = max1;
        }
      }
      System.out.println(Arrays.toString(arr));
    }
    System.out.println(Arrays.toString(arr));

    // 4. Put all odd numbers into another array
    int counter = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 != 0){
        System.out.println(arr[i]);
        counter++;
      }
    }
    System.out.println(counter);
    int oddArr[] = new int[counter];
    int idx = 0;
    for (int x : arr){
      if (x % 2 == 1){
        oddArr[idx] = x;
        idx++;
      }
    }
    System.out.println(Arrays.toString(oddArr));

    // Given a string, find the most of times appeared in a given string. "hello" -> 'l'
    // Approach 1
    String string1 = "hello";
    int targetIdx = -1;
    int maxCount = 0;
    for (int i = 0;i < string1.length();i++){
      int countCh = 0;
      for (int j = 0; j <string1.length(); j++){
        if (string1.charAt(i) == string1.charAt(j)){
          countCh++;
        }
      }
      if (countCh > maxCount){
        maxCount = countCh;
        targetIdx = i;
      }
    }
    System.out.println(string1.charAt(targetIdx));

    // Approach 2
    int[] countCh = new int[26];
    for (int i = 0; i < string1.length(); i++){
      countCh[string1.charAt(i) -'a']++; //!!!!!!!!!!!!!!!!!!!!
    }
    int maxCountCh = countCh[0];
    int chIdx = -1;
    for (int i = 0; i < countCh.length; i++){
      if (countCh[i] > maxCountCh) {
        maxCountCh = countCh[i];
        chIdx = i;
      }
    }
    char chResult = (char) (chIdx + 97); 
    System.out.println(chResult);

    // Given  2 strings2 
    // String + char -> String
    // char + char -> int 
    String str1 = "abcd";
    String str2 = "pqrs";
    String str3 = "";
    for (int i = 0; i < str1.length(); i++){
      //str3 += str1.charAt(i) + str2.charAt(i); // char + char -> int
      str3 = str3 + str1.charAt(i) + str2.charAt(i); // String + char + char -> String
    }
    System.out.println(str3);

    

  }
}
