/*
Program Name: TwoDice2.java

Description: In Chapter 4, you created a Die class from which you could instantiate an object containing a random value from 1 through 6. You also wrote an application that randomly “throws” two dice and displays their values. Modify the application so it determines whether the two dice are the same, the first has a higher value, or the second has a higher value

Author: Khusanjon Bobokhojaev

Last Modified: 03.21.2024

*/

import java.util.Arrays;

public class TwoDice2 {
    
    public static void main(String[] args) {

        Die diceOne = new Die();
    
        Die diceTwo = new Die();
    
        int[] oneValues = new int[5];
    
        int[] twoValues = new int[5];

        for (int i=0; i < 5; i++){
    
            oneValues[i] = diceOne.getDieRoll();

            twoValues[i] = diceTwo.getDieRoll();

            diceTwo.rerollDie();
    
            diceOne.rerollDie();

        }

        System.out.println("Set One: " + Arrays.toString(oneValues));
    
        System.out.println("Set Two: " + Arrays.toString(twoValues));

        System.out.println('\n' + "Now comparisons: " + '\n');

        for (int i=0; i<5; i++){

            if(oneValues[i]<twoValues[i]){

                System.out.println(dieValueEval(i,2));

            } else if((oneValues[i]>twoValues[i])){

                System.out.println(dieValueEval(i,1));

            } else {

                System.out.println(dieValueEval(i,0));

            }

        }


    }

    public static String dieValueEval (int i, int value){

        String setNameA = "Set One";
        String setNameB = "Set Two";

        if (value == 2){

            setNameA = "Set Two";
            setNameB = "Set One";


        } else if (value == 1){

            setNameA = "Set One";
            setNameB = "Set Two";

        } else {

            return "Die Roll Round " + (i+1) + " is a tie." + "                               " + setNameA + " = " + setNameB;

        }
        return "Die Roll Round " + (i+1) +  ": " + setNameA + " is greater than " + setNameB + "        " + setNameA + " > " + setNameB;

    }
    
}

