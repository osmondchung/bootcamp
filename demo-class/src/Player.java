public class Player {
  private Card[] cards;

  public Player(){
    this.cards = new Card[0];
  }

  public Card[] getCards(){
    return this.cards;
  }

  public void receive(Card newCard){
    // create new array
    Card[] newCards = new Card[this.cards.length +1];
    // copy the elements in this.items to new array items
    for (int i = 0; i < this.cards.length; i++){
      newCards[i] = this.cards[i];
    }
    // Add the new item to the tail of array
    newCards[newCards.length - 1] = newCard;
    // replace the new array to the object array address
    this.cards = newCards;
  }

  public static void main(String[] args) {
    Player p1 = new Player();
    Deck d1 = new Deck();
  }
}
