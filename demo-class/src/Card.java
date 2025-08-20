public class Card {
  private int rank; //
  private String suit; // 
  
  // All arguments constructor
  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // getter()
  public int getRank(){
    return this.rank;
  }

  public String getSuit(){
    return this.suit;
  }

  public String toString(){
    return "Card(" //
    + "rank=" + this.rank //
    + ",suit=" + this.suit //
    + ")";
  }

  public static void main(String[] args) {
  }
}
