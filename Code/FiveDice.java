/*
Program Name: FiveDice.java

Description: Application that randomly “throws” five dice for the computer and five dice for the player

Author: Khusanjon Bobokhojaev

Last Modified: 03.03.2024

*/

import java.util.Arrays;

public class FiveDice {

    public static void main(String[] args) {

        Die computerDice = new Die();

        Die playerDice = new Die();

        int[] computerValues = new int[5];

        int[] playerValues = new int[5];

        for (int i=0; i < 5; i++){

            playerValues[i] = playerDice.getDieRoll();

            // Debugging Statement - System.out.println("Player Value Out " + i);
            
            // Debugging Statement - System.out.println(playerValues[i]);

            computerValues[i] = computerDice.getDieRoll();

            // Debugging Statement - System.out.println("Computer Value Out " + i);

            // Debugging Statement - System.out.println(computerValues[i]);

            computerDice.rerollDie();

            playerDice.rerollDie();

        }

        System.out.println("Computer: " + Arrays.toString(computerValues));

        System.out.println("Player: " + Arrays.toString(playerValues));
        
    }

}
