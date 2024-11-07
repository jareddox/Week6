package WarGame;

public class App {
  public static void main(String[] args) throws Exception {
    //Setup Players
    Player player1 = new Player("Jack");
    Player player2 = new Player("Jill");

    //Initialize Deck
    Deck deck = new Deck();
    String trump = deck.getTrump();

    deck.shuffle();

    //Game Loop
    for (int i = 0; i < 26; i++) {
      player1.draw(deck.draw());
      player2.draw(deck.draw());

      player1.describe();
      player2.describe();

      int p1Card = player1.flip().getValue(trump);
      int p2Card = player2.flip().getValue(trump);

      if( p1Card > p2Card ) {
        System.out.println( player1.getName() + " wins flip.");
        player1.incrementScore();
      } else if(p1Card < p2Card) {
        System.out.println(player2.getName() + " wins flip.");
        player2.incrementScore();
      } else {
        System.out.println("Tie.");
      }
    }

    System.out.print(player1.getName() + "'s score is: " + player1.getScore() + " and ");
    System.out.println(player2.getName() + "'s score is: " + player2.getScore());
    if(player1.getScore() > player2.getScore()) {
      System.out.println( player1.getName() + " wins.");
    } else if(player1.getScore() < player2.getScore()) {
      System.out.println(player2.getName() + " wins.");
    } else {
      System.out.println("Tie.");
    }

  }
}

