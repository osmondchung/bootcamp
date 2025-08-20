public class String1 {
  private char[] chs;

  public String1(String str){
    this.chs = str.toCharArray();
  }

  public int length(){
    return this.chs.length;
  }

  public char charAt(int index){
    return this.chs[index];
  }

  public boolean contains(char chr){
    for (int i = 0; i < this.chs.length; i++){
      if (this.chs[i] == chr){
        return true;
      }
    }
    return false;
  }

  public int indexOf(char chr){
    for (int i = 0; i < this.chs.length; i++){
      if (this.chs[i] == chr){
        return i;
      }
    }
    return -1;
  }

  public String replace(char oldChar, char newChar){
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < this.chs.length; i++){
      if (this.chs[i] == oldChar){
        newStr.append(newChar);
      } else {
        newStr.append(this.chs[i]);
      }
    }
    return newStr.toString();
  }

  public String toString(){
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < this.chs.length; i++){
        newStr.append(this.chs[i]);
    }
    return newStr.toString();
  }

  public static void main(String[] args) {
    String1 s = new String1("hello");
    System.out.println(s.length());
    System.out.println(s.charAt(0));
    System.out.println(s.contains('e'));
    System.out.println(s.indexOf('e'));
    System.out.println(s.replace('e', 'x'));
    System.out.println(s);
  }
}
