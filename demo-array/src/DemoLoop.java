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
    int[] arr = new int[] {4, -9, 100, -50, 400, 230};
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

    // moving elements
    //int temp2 = arr[0];
    for (int i = 0; i < arr.length - 1; i++){
      temp = arr[i];
      arr[i] = arr[i+1];
      arr[i + 1] = temp;
    }
    //arr[arr.length - 1] = temp2;
    System.out.println(Arrays.toString(arr));

    // Move the max value to the tail
     int max1 = arr[0];
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i] > arr[i + 1]){
        max1 = arr[i];
        arr[i] = arr[i+1];
        arr[i + 1] = max1;
      }
    }
    System.out.println(Arrays.toString(arr));

    // 3. Sorting
    // Asc
    for (int j = 0; j < arr.length;j++){
      for (int i = 0; i < arr.length - 1; i++){
        if (arr[i] > arr[i + 1]){
          max1 = arr[i];
          arr[i] = arr[i+1];
          arr[i + 1] = max1;
        }
      }
    }
    System.out.println(Arrays.toString(arr));


  }
}
