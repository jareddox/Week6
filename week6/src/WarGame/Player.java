package WarGame;
import java.util.*;

public class Player {
  private List<Card> hand = new ArrayList<>();
  private int score = 0;
  private String name;

  public int incrementScore(){
    return score++;
  }

  public int getScore(){
    return score; 
  }

  public Player(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void describe(){
    //System.out.println("Player's name is: " + name);
    System.out.println(name + " is holding a " + hand.get(0).getValue() + " of " + hand.get(0).getSuit());
  }

  public Card flip(){
    Card pull = hand.remove(0);
    return pull;
  } 

  public void draw(Card card){
    hand.add(card);
  }

}
