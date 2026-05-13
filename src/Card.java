public class Card {

    public int value;
    public String name;
    public String suit;

    public Card(int pvalue, int pname, int psuit) {
        value = pvalue;

        if (pname == 0) {
            name = "Ace";
            value = 11;
        } else if (pname == 1) {
            name = "Two";
            value = 2;
        } else if (pname == 2) {
            name = "Three";
            value = 3;
        } else if (pname == 3) {
            name = "Four";
            value = 4;
        } else if (pname == 4) {
            name = "Five";
            value = 5;
        } else if (pname == 5) {
            name = "Six";
            value = 6;
        } else if (pname == 6) {
            name = "Seven";
            value = 7;
        } else if (pname == 7) {
            name = "Eight";
            value = 8;
        } else if (pname == 8) {
            name = "Nine";
            value = 9;
        } else if (pname == 9) {
            name = "Ten";
            value = 10;
        } else if (pname == 10) {
            name = "Jack";
            value = 10;
        } else if (pname == 11) {
            name = "Queen";
            value = 10;
        } else if (pname == 12) {
            name = "King";
            value = 10;
        }

        if (psuit == 0){
            suit = "hearts";
        }else if (psuit == 1){
            suit = "diamonds";
        } else if (psuit == 2) {
            suit = "clubs";
        }else if (psuit == 3){
            suit = "spades";
    }


        printInfo();
    }

    public void printInfo() {
        System.out.println("The " + name + " of " + suit + " is worth "
                + value + " points.");
    }
}