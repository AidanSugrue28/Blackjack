public class Player {

    public int cardTotal;
    public boolean isBust;
    public Card[] hand;
    public boolean isHit;
    public String name;

    public Player() {
        cardTotal = 0;
        isBust = false;
        isHit = false;
        name = "Player";
        hand = new Card[10];

        printInfo();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Card Total: " + cardTotal);
        System.out.println("Is Bust: " + isBust);
        System.out.println("Is Hit: " + isHit);

        System.out.println("Hand:");
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                hand[i].printInfo();
            }
        }
    }
}