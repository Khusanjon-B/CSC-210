/*
Program Name: CLUbID.java

Description: Program that prompts user for ID and modifies it based on new standard

Author: Khusanjon Bobokhojaev

Last Modified: 04.25.2024

*/

import java.util.Scanner;

public class CLUbID{

    public static void main(String[] args) {
        
        Scanner inputScan = new Scanner(System.in);

        //This is the input checks for the ID input being an integer, being 7 digits, and not starting with 0

        int[] inputCheck = {0,0,0};

        String userInput;

        StringBuilder newID = new StringBuilder("!00-");

        int iD = 0;

        String iDlength = null;

        System.out.println("Welcome to the new standard ID converter machine!");

        System.out.println("Please enter your ID below:");

        do{

            System.out.print("--->");

            userInput = inputScan.nextLine();

            try{

                iD = Integer.parseInt(userInput);

                inputCheck[0] = 1;

                inputCheck[1] = 1;

                iDlength = String.valueOf(iD);

                if(iDlength.length() == 7){

                    inputCheck[2] = 1;
    
                } else if(userInput.charAt(0) == '0'){
                    
                    resetinputCheck(inputCheck);

                    System.out.println("Please enter a valid 7 digit ID that contains no leading 0");
    
                } else {

                    resetinputCheck(inputCheck);

                    System.out.println("Please enter a valid 7 digit ID");

                }

            } catch (Exception invalidInput) {

                resetinputCheck(inputCheck);

                System.out.println("Please enter a valid numeric ID:");

            }


        } while((inputCheck[0] != 1) && (inputCheck[1] != 1) && (inputCheck[2] != 1));

        for (int i = 0; i < 3; i++){

            newID.append(iDlength.charAt(i));

        }

        newID.append("#");

        for (int i = 3; i < 7; i++){

            newID.append(iDlength.charAt(i));

        }

        System.out.println("Here is your new ID: " + newID);

        inputScan.close();

    }

    public static void resetinputCheck(int[] checklist){

        for(int i = 0; i < checklist.length; i++){

            checklist[i] = 0;

        }

    }

}