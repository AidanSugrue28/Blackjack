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
        hand = new Card[2];

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Card Total: " + cardTotal);
        System.out.println("Is Bust: " + isBust);
        System.out.println("Is Hit: " + isHit);
        for (int i = 0; i < hand.length; i++) {
                hand[i].printInfo();
        }
    }
    public void calculateTotal(){
        int addValue = 0;
        for(int d = 0; d < hand.length; d++){
            addValue = addValue + hand[d].value;
        }
        cardTotal = addValue;
    }
}