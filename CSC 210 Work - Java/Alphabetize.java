/*
Program Name: Alphabetize.java

Description: An application that accepts three Strings from the user and, without regard to case, appropriately displays a message that indicates whether the Strings were entered in alphabetical order

Author: Khusanjon Bobokhojaev

Last Modified: 03.28.2024

*/

import java.util.Scanner;

public class Alphabetize
{

    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter in a random string");

        StringBuilder firstString = new StringBuilder(scanner1.nextLine());

        System.out.println("Enter in another a random string");
        
        StringBuilder secondString = new StringBuilder(scanner1.nextLine());

        System.out.println("Enter in third a random string");
        
        StringBuilder thirdString = new StringBuilder(scanner1.nextLine());

        String alph = null;

        if((firstString.compareTo(secondString) <= 0) && (secondString.compareTo(thirdString) <= 0)){

            alph = "";

        } else {

            alph = "not ";

        }

        System.out.println("Your inputs were " + alph + "in alphabetical order");

        System.out.println("The strings you gave were: ");

        System.out.println(firstString);

        System.out.println(secondString);

        System.out.println(thirdString);

        scanner1.close();

    }

}