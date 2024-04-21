/*
Program Name:

Description: The class holds fields that contain a Card’s value and suit. Previously, the suit was represented by a single character (s, h, d, or c). Modified the class so that the suit is a string (Spades, Hearts, Diamonds, or Clubs). Also, added a new field to the class to hold the string representation of a Card’s rank based on its value. Within the Card class setValue() method, besides setting the numeric value, also set the string rank value as follows.

Numeric Value                   String Value for Rank
1                               Ace
2-10                            2-10
11                              Jack
12                              Queen
13                              King


Author: Khusanjon Bobokhojaev

Last Modified: 04.20.2024

*/

public class Card {
    
    private String suit;
    private int value;
    private String cardRank;

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

        if(value == 1){

            cardRank = "Ace";

        } else if(value == 11){

            cardRank = "Jack";

        } else if(value == 12){

            cardRank = "Queen";

        } else if(value == 13){

            cardRank = "King";

        } else if(value > 1 && value < 11){

            cardRank = String.valueOf(value);

        } else {

            cardRank = "Invalid Rank";

        }

    }

    public String getSuit() {

        return suit;

    }

    public int getValue() {

        return value;

    }

    public String getRank() {

        return cardRank;

    }

}
