public class Card {
    
    private String suit;
    private int value;

    public void setSuit(int code) {
        
        if (code == 0){

            suit = "Spades";

        } else if (code == 1) {

            suit = "Diamonds";

        } else if (code == 2) {

            suit = "Hearts";

        } else if (code == 3){

            suit = "Clubs";

        }

    }

    public void setValue(int number) {
        value = number;
    }

    public String getSuit() {

        return suit;

    }

    public int getValue() {

        return value;

    }

}
