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

        int cardIndex = 0;
        for (int x=0;x<4; x++) {
            for (int i = 0; i < 13; i++) {
                deck[cardIndex] = new Card(10, i, x);
                cardIndex++;
            }

        }
        shuffle();

        printDeck();
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