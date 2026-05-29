public class Dealer {

    public int cardTotal;
    public boolean isBust;

    public Card[] hand;
    public int cardCount;

    public Dealer() {

        cardTotal = 0;
        isBust = false;

        hand = new Card[10];
        cardCount = 0;
    }

    public void addCard(Card newCard) {
        hand[cardCount] = newCard;
        cardCount++;

        calculateTotal();
    }

    public void calculateTotal() {

        cardTotal = 0;
        int aceCount = 0;

        for (int i = 0; i < cardCount; i++) {

            cardTotal += hand[i].value;

            if (hand[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        while (cardTotal > 21 && aceCount > 0) {
            cardTotal -= 10;
            aceCount--;
        }

        if (cardTotal > 21) {
            isBust = true;
        }
    }

    public void printHand() {

        System.out.println("Dealer Hand:");

        for (int i = 0; i < cardCount; i++) {
            hand[i].printInfo();
        }

        System.out.println("Dealer Total = " + cardTotal);
    }
}