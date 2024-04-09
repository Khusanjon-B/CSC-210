/*
Program Name: PhoneNumberFormat.java

Description: Program that inserts parentheses, a space, and a dash into a string of 10 user-entered numbers to format it as a phone number. For example, 5153458912 becomes (515) 345-8912. If the user does not enter exactly 10 digits, display an error message. Continue to accept user input until the user enters 999.

Author: Khusanjon Bobokhojaev

Last Modified: 04.09.2024

*/

import java.util.Scanner;

public class PhoneNumberFormat {

    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);

        String numCheck = null;

        Integer userInput = 0;

        String check = null;

        StringBuilder phoneNumber = new StringBuilder();

        do {

            do {

                System.out.println("Please enter a 10 digit number");

                try{

                    userInput = Integer.parseInt(scanner1.nextLine());

                    numCheck = "Pass";

                } catch(Exception error){

                    numCheck = "Invalid";

                }

                if(userInput == 999){

                    break;

                }

                String number = userInput.toString();

                if(number.length() != 10){

                    numCheck = "Invalid";

                } else {

                    numCheck = "Pass";

                }

                if(numCheck.equals("Invalid")){

                    System.out.println("You have not entered a 10 digit number");

                }

            } while (numCheck.equals("Invalid"));

            phoneNumber.append(userInput);

            phoneNumber.insert(0,"(");

            phoneNumber.insert(4,")");

            phoneNumber.insert(5," ");

            phoneNumber.insert(9,"-");

            check = "Pass";

        } while ((check.equals("Invalid")));

        System.out.println("Your phone number is " + phoneNumber);

        scanner1.close();

    }

}
