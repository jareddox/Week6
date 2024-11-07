package WarGame;

public class Card {
  private int value;
  private String suit;

  public Card(String suit, int value) {
    this.suit = suit;
    this.value = value;
  }

  public void setValue(int value){
    this.value = value;
  }

  public int getValue() {
    return this.value;
  };

  public int getValue(String trumpSuit) {
    if (trumpSuit == suit) {
      this.value += 13;
    }
    return value;
  }

  public void setSuit(String suit){
    this.suit = suit;
  }

  public String getSuit() {
    return this.suit;
  }
}
