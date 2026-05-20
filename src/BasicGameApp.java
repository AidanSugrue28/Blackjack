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
        System.out.println("welcome to blackjack");

        deck = new Card[52];
        pl = new Player();
        dl = new Dealer();

        int cardIndex = 0;
        for (int x=0;x<4; x++) {
            for (int i = 0; i < 13; i++) {
                deck[cardIndex] = new Card(10, i, x);
                cardIndex++;
            }

        }

        shuffle();
        printDeck();

        pl.hand[0] = deck[0];
        pl.hand[1] = deck[1];

        dl.hand[0] = deck[2];
        dl.hand[1] = deck[3];

        Scanner s = new Scanner(System.in);

        System.out.println("what is your name?");
        String aName = s.nextLine();

        System.out.println(aName);

        pl.name = aName;

        pl.calculateTotal();
        dl.calculateTotal();

        pl.printInfo();
        dl.printInfo();

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