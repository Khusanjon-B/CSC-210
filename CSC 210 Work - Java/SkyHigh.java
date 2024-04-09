/*
Program Name: SkyHigh.java

Description:

You are tasked by SkyHigh University to develop a tuition inquiry application, which informs the user of the tuition upon user’s request.

User will be prompted to enter letter U for Undergraduate, letter M for Master, or letter P for Ph.D.

If user enters U, application displays the Undergraduate tuition of $12345 in complete sentences and terminates.

If user enters M, application displays the Master tuition of $123456 in complete sentences and terminates.

If user enters P, application displays the Ph.D. tuition of $1234567 in complete sentences and terminates.

If the user enters an invalid input, the application displays a friendly warning and terminates.

Author: Khusanjon Bobokhojaev

Last Modified: 04.04.2024

*/

import java.util.Scanner;

public class SkyHigh
{

    public static void main(String[] args) {
    
        Scanner scanner1 = new Scanner(System.in);

        String userInput;

        System.out.println("Welcome to your Tuition Request Service");

        System.out.println("Please indicate your class level as undergraduate, masters, or Ph.D. using one of the following letters:");

        System.out.println("Undergraduate - U; Masters/Graduate - M; Ph.D. - P;");

        userInput = scanner1.nextLine();

        if(userInput.equals("U")){

            System.out.println("As an undergraduate student your tuition is $12345.");

        } else if(userInput.equals("M")){

            System.out.println("As a masters student your tuition is $123456.");

        } else if(userInput.equals("P")){

            System.out.println("As a Ph.D. student your tuition is $1234567.");

        } else{

            System.out.println("Unfortunately you entered an invalid value.");

        }

        scanner1.close();

    }

}