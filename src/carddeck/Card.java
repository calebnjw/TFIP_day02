package carddeck;

public class Card {
  // attributes
  private String[] SUITS = {"Clubs", "Spades", "Hearts", "Diamonds"};
  private String suit;
  private String name;
  private int value;
  private int rank;

  // constructor
  public Card(int suitOrder, int cardOrder) {
    this.setSuit(suitOrder);
    this.setRank(cardOrder);
    this.setValue();
    this.setName();
  }

  // getters and setters
  public String getSuit() { return this.suit; }
  private void setSuit(int suitOrder) { 
    this.suit = SUITS[suitOrder];
    // System.out.println("Suit: " + this.suit);
  }
  
  public String getName() { return this.name; }
  private void setName() {
    this.name = switch (this.rank) {
      case 1 -> "Ace";
      case 11 -> "Jack";
      case 12 -> "Queen";
      case 13 -> "King";
      default -> Integer.toString(this.rank);
    };
    // System.out.println("Name: " + this.name);
  }

  public int getValue() { return this.value; }
  private void setValue() {
    this.value = (this.rank > 10) ? 10 : this.rank;
    // System.out.println("Value: " + this.value);
  }

  public int getRank() { return this.rank; }
  private void setRank(int cardOrder) { 
    this.rank = cardOrder + 1; 
    // System.out.println("Rank: " + this.rank);
  }
}
