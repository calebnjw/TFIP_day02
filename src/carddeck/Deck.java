package carddeck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
  // attributes
  public int cardCount = 52;
  private Card[] deck = new Card[cardCount];
  
  // constructor
  public Deck() {
    generateDeck();
    shuffleDeck();
  }

  public Deck(boolean shuffled) {
    generateDeck();
    if (shuffled) {
      shuffleDeck();
    }
  }

  // getters and setters
  
  public void getDeck() {
    for (int i = 0; i < cardCount; i += 1) {
      System.out.printf("%s of %s. Value: %d \n", deck[i].getName(), deck[i].getSuit(), deck[i].getValue());
    }
  }

  // methods
  public void generateDeck() {
    System.out.println("Creating new deck.");
    
    // 4 suits
    for (int i = 0; i < 4; i += 1) {
      // 13 cards per suit
      for (int j = 0; j < 13; j += 1) {
        // create a new card item for each position in the array
        // i -> suit that card is in
        // j -> rank / name of card
        deck[(i * 13) + j] = new Card(i, j);
      }
    }
  }

  public void shuffleDeck() {
    System.out.println("Shuffling deck.");
    List<Card> cardList = Arrays.asList(deck);
    Collections.shuffle(cardList);
    cardList.toArray(deck);
  }

  public int getCardCount() {
    return cardCount;
  }
}
