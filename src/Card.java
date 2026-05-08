public class Card {

    public int value;
    public String name;
    public String suit;

    public Card(int pvalue, int pname, String psuit) {
        value = pvalue;
        if (pname ==0){
            name = "Ace";
            value = 11;
        } else if (pname == 1){
            name = "two";
            value = 2;
        }
        suit = psuit;

        printInfo();
    }

    public void printInfo() {
        System.out.println("The " + name + " of " + suit + " is worth "
                + value + " points.");
    }
}
