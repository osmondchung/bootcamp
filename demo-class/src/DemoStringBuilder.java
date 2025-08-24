public class DemoStringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    sb.append("a"); // similar to setter
    sb.append("b");
    System.out.println(sb);
    System.out.println(sb.toString());

    String str = "";
    str = str + "a"; // return a new object
    str = str + "b";
    System.out.println(str);

    long before = System.currentTimeMillis(); // ms
    String s1 = "";
    for (int i = 0; i < 100000; i++){
      s1 = s1 + "a";
    }
    long after = System.currentTimeMillis();
    System.out.println("s1 results=" + (after - before));

    before = System.currentTimeMillis();
    StringBuilder s2 = new StringBuilder("");
    for (int i = 0; i < 100000; i++){
      s2.append("a");
    }
    after = System.currentTimeMillis();
    System.out.println("s2 results=" + (after - before));
  }
}
