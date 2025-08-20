public class Deck {
  // Static Variable (dictionary)
  // final: will not change anymore
  // static: everything can use the defined variable
  public static final int[] RANKS = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13};
  public static final String[] SUITS = new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};
  
  // Instance Variable, instance = object
  private Card[] cards;

  // Constructor
  public Deck() {
    this.cards = new Card[52];
    int idx = 0;
    for (String suit : SUITS) {
      for (int rank : RANKS) {
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
  }

  public void removeCard(int removeIndex){
    if (removeIndex > this.cards.length - 1) {
      return;
    }
    // 1. new Array (length - 1)
    Card[] newCards = new Card[this.cards.length - 1];
    // 2. Copy all cards, except the removed target
    int idx = 0;
    for (int i = 0; i < this.cards.length; i++){
      if (removeIndex !=i){
        newCards[idx] = this.cards[i];
        idx++;
      }
    }
    // 3. replace new array to array address
    this.cards = newCards;
  }

  public Card[] getCards(){
    //this.cards = cards;
    return this.cards;
  }

  public static void main(String[] args) {
    new Deck();
  }
}
