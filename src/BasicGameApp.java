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

        for (int i = 0; i < 13; i++) {
            deck[i] = new Card(10, i, "diamonds");
        }

        printDeck();
    }

    public void printDeck() {
        for (int i = 0; i < 13; i++) {
            deck[i].printInfo();
        }
    }
}