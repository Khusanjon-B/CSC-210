/*
Program Name: OddStarDiamond.java

Description: OddStarDiamond of size i is a StarDiamond that has i *’s in the center of the pattern where i is an odd number. Program requests  the user with a proper prompt for an odd integer, if the user input is not an integer or not an odd integer, repeats the request with a friendly message until the input is an odd integer. Then output the odd star diamond.

Author:

Last Modified:

*/

import java.util.Scanner;

public class OddStarDiamond {
    
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);

        boolean intCheck = false;

        Integer userInput = 0;

        int oddNumber = 0;

        System.out.println("Welcome to the odd star diamon generator!");

        do {

            System.out.println("Please enter a whole odd number");

            try{

                userInput = Integer.parseInt(scanner1.nextLine());

                intCheck = true;

            } catch(Exception error){

                intCheck = false;

            }

            if((userInput % 2) != 1){

                intCheck = false;

            }

        } while (intCheck == false);

        oddNumber = userInput;

        System.out.println("Here is your diamond!");

        System.out.println();

        int lines = oddNumber;

        int spaces = (oddNumber - 1)/2 + 1;

        int stars = 1;
        
        int middleCheck = 0;
        
        for(int i = 0; i < lines ; i++){

            for(int k = 0; k < spaces; k++){

                System.out.print(" ");

            }

            for(int j = 0; j < stars; j++){

                System.out.print("*");

            }

            if(stars == oddNumber){

                middleCheck = 1;
            
            }

            if(middleCheck == 1){

                stars -= 2;

                spaces++;

            } else {

                spaces--;

                stars += 2;

            }

            System.out.println();

        }

        scanner1.close();

    }

}
