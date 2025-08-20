import java.util.Arrays;

public class Dealer {
  private Deck deck;
  private Player[] players = new Player[4]; // 4 players

  public Dealer(Deck deck, Player player1, Player player2, Player player3, Player player4) {
    this.deck = deck;
    this.players[0] = player1;
    this.players[1] = player2;
    this.players[2] = player3;
    this.players[3] = player4;
  }
  
  //Dealer
  public void distribute(){
    int noOfCards = deck.getCards().length;
    for (int i = 0; i < noOfCards; i++){
      // 1. 4 palyers
      this.players[i % 4].receive(deck.getCards()[0]);
      // 2. remove the card address in deck card array
      deck.removeCard(0);
    }
  }
  public static void main(String[] args) {
    Deck d1 = new Deck();
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    
    Dealer dealer = new Dealer(d1, p1, p2, p3, p4);
    dealer.distribute();
    System.out.println("cards=" + Arrays.toString(d1.getCards()));
    System.out.println("p1 cards=" + Arrays.toString(p1.getCards()));
    System.out.println("p2 cards=" + Arrays.toString(p2.getCards()));
    System.out.println("p3 cards=" + Arrays.toString(p3.getCards()));
    System.out.println("p4 cards=" + Arrays.toString(p4.getCards()));

  }
}
