import java.util.Scanner;

public class BasicGameApp {

    public Card[] deck;
    public Player pl;
    public Dealer dl;
    public boolean gameOn;

    public static void main(String[] args) {
        new BasicGameApp();
    }

    public BasicGameApp() {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!!");

        deck = new Card[52];
        pl = new Player();
        dl = new Dealer();

        int cardIndex = 0;

        for (int suit = 0; suit < 4; suit++) {

            for (int value = 0; value < 13; value++) {

                deck[cardIndex] = new Card(10, value, suit);
                cardIndex++;
            }
        }

        shuffle();

        int deckPosition = 0;

        System.out.println("What is your name?");
        pl.name = s.nextLine();

        // initial deal
        pl.addCard(deck[deckPosition++]);
        pl.addCard(deck[deckPosition++]);

        dl.addCard(deck[deckPosition++]);
        dl.addCard(deck[deckPosition++]);

        // PLAYER TURN
        boolean playerTurn = true;

        while (playerTurn) {

            System.out.println();
            pl.printHand();

            if (pl.isBust) {
                System.out.println("You busted!");
                return;
            }

            System.out.println();
            System.out.println("Hit or Stand?");
            String choice = s.nextLine();

            if (choice.equalsIgnoreCase("hit")) {

                Card newCard = deck[deckPosition++];

                System.out.println("You drew:");
                newCard.printInfo();

                pl.addCard(newCard);

            } else {

                playerTurn = false;
            }
        }

        // DEALER TURN
        System.out.println();
        System.out.println("Dealer Turn:");

        while (dl.cardTotal < 17) {

            Card newCard = deck[deckPosition++];

            System.out.println("Dealer draws:");
            newCard.printInfo();

            dl.addCard(newCard);
        }

        dl.printHand();

        if (dl.isBust) {
            System.out.println("Dealer busted! You win!");
            return;
        }

        // WINNER
        System.out.println();

        if (pl.cardTotal > dl.cardTotal) {

            System.out.println("You win!");

        } else if (pl.cardTotal < dl.cardTotal) {

            System.out.println("Dealer wins!");

        } else {

            System.out.println("Push! Tie game.");
        }
    }

    public void printDeck() {
        for (int i = 0; i < 13; i++) {
            deck[i].printInfo();
        }
    }

    public void shuffle(){
        for(int w = 0; w <deck.length; w++){
            int randy = (int) (Math.random() * 52);

            Card helper = deck[randy];
            deck[randy] = deck[w];
            deck[w] = helper;
        }

    }
}