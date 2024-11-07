package WarGame;
import java.util.*;
// import java.io.*;

public class Deck {
  private List<Card> cards = new ArrayList<>();

  public Deck(){
    for (int i = 1; i <= 4; i++){
      String suit;
      Card newCard = null;
      for (int j = 1; j <= 13; j++){
        switch (i){
          case 1:
            suit = "HEARTS";
            break;
          case 2:
            suit = "SPADES";
            break;
          case 3:
            suit = "CLUBS";
            break;
          case 4:
            suit = "DIAMONDS";
            break;
          default:
            suit = null;
          }
          newCard = new Card(suit, j);
          cards.add(newCard);
      }
    }
    this.shuffle();
  }

  public void shuffle(){
    List<Card> suffledCards = new ArrayList<>();
    while (!cards.isEmpty()){
      suffledCards.add(cards.remove((int)(Math.random()*(cards.size()))));
    }
    cards = suffledCards;
  };

  public String getTrump() {
    Card card = cards.get(0);
    System.out.println("Trump suit is: " + card.getSuit());
    return card.getSuit();
  }

  public Card draw(){
    return cards.remove(0);
  };


}

