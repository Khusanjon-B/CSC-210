/*
Program Name: FiveDice2.java

Description: Created a Die application that randomly “throws” five dice
for the computer and five dice for the player. The application displays the
values. Modified the application to decide the winner based on the following
hierarchy of Die values. Any higher combination beats a lower one—for
example, five of a kind beats four of a kind.

Author: Khusanjon Bobokhojaev

Last Modified: 05.05.2024

*/

import java.util.Arrays;

public class FiveDice2 {

    public static void main(String[] args) {

        Die computerDice = new Die();

        Die playerDice = new Die();

        int[] computerValues = new int[5];

        int[] playerValues = new int[5];

        int[] playerSameCount = new int[5];

        int[] computerSameCount = new int[5];

        int playerLargest = 0;

        int computerLargest = 0;

        for (int i=0; i < 5; i++){

            playerValues[i] = playerDice.getDieRoll();

            computerValues[i] = computerDice.getDieRoll();

            computerDice.rerollDie();

            playerDice.rerollDie();

        }

        for (int i = 0; i < playerValues.length; i++){

            for (int j = 0; j < playerValues.length; j++){

                if (playerValues[i] == playerValues[j]){

                    playerSameCount[i] += 1;

                }

                if (computerValues[i] == computerValues[j]){

                    computerSameCount[i] += 1;

                }

            }
            
        }

        for (int i = 0; i < playerSameCount.length; i++){

            if(playerSameCount[i] > playerLargest){

                playerLargest = playerSameCount[i];

            }

            if(computerSameCount[i] > computerLargest){

                computerLargest = computerSameCount[i];

            }

        }

        System.out.println("Computer: " + Arrays.toString(computerValues));

        System.out.println("Player: " + Arrays.toString(playerValues));

        System.out.println("Player has " + playerLargest + " of a kind.");

        System.out.println("Computer has " + computerLargest + " of a kind.");

        if (computerLargest > playerLargest){

            System.out.println("The computer wins!");

        } else if (computerLargest < playerLargest){

            System.out.println("The player wins!");

        } else {

            System.out.println("It's a tie!");

        }
        
    }

}
