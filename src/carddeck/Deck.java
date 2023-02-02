package carddeck;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Deck {
  // attributes
  public int CARDS_TOTAL = 52;
  public int CARDS_PER_SUIT = 13;
  private List<Card> deck = new ArrayList<>();
  
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
    for (int i = 0; i < CARDS_TOTAL; i += 1) {
      System.out.printf("%s of %s. Value: %d \n", deck.get(i).getName(), deck.get(i).getSuit(), deck.get(i).getValue());
    }
  }

  // methods
  public void generateDeck() {
    System.out.println("Creating new deck.");
    
    // 4 suits
    for (int i = 0; i < 4; i += 1) {
      // 13 cards per suit
      for (int j = 0; j < CARDS_PER_SUIT; j += 1) {
        // create a new card item for each position in the array
        // i -> suit that card is in
        // j -> rank / name of card
        deck.add(new Card(i, j));
      }
    }
  }

  public void shuffleDeck() {
    System.out.println("Shuffling deck.");
    Collections.shuffle(deck);
  }

  public int getCardCount() {
    return CARDS_TOTAL;
  }
}

// test modification
