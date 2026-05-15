public class Dealer {

    public boolean isOver16;
    public int cardTotal;
    public Card[] hand;
    public boolean isBust;

    public Dealer() {
        isOver16 = false;
        cardTotal = 0;
        isBust = false;
        hand = new Card[10];

        printInfo();
    }

    public void printInfo() {
        System.out.println("Dealer Info:");
        System.out.println("Card Total: " + cardTotal);
        System.out.println("Is Over 16: " + isOver16);
        System.out.println("Is Bust: " + isBust);

        System.out.println("Hand:");
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                hand[i].printInfo();
            }
        }
    }
}