/*
Program Name: AscendingAndDescending.java

Description: An application that asks a user to enter three integers. Display them in ascending and descending order

Author: Khusanjon Bobokhojaev

Last Modified: 03.14.2024

*/

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending
{

    public static void main(String[] args) {
        
        int[] integerValuesAscending = new int[3];

        int[] integerValuesDescending = new int[3];

        int number1;

        int number2;

        int number3;

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter a number");

        number1 = Integer.parseInt(scanner1.nextLine());

        System.out.println("Enter another number");

        number2 = Integer.parseInt(scanner1.nextLine());

        System.out.println("Enter another number");

        number3 = Integer.parseInt(scanner1.nextLine());

        scanner1.close();

        if ((number1 > number2) && (number1 > number3)){

            integerValuesAscending[2] = number1;

            if(number2 > number3){

                integerValuesAscending[1] = number2;

                integerValuesAscending[0] = number3;

            } else {

                integerValuesAscending[0] = number2;

                integerValuesAscending[1] = number3;

            }

        } else if ((number1 < number2) && (number1 < number3)){

            integerValuesAscending[0] = number1;

            if(number2 > number3){

                integerValuesAscending[2] = number2;

                integerValuesAscending[1] = number3;

            } else {

                integerValuesAscending[1] = number2;

                integerValuesAscending[2] = number3;

            }

        } else {

            integerValuesAscending[1] = number1;

            if(number2 > number3){

                integerValuesAscending[3] = number2;

                integerValuesAscending[0] = number3;

            } else {

                integerValuesAscending[0] = number2;

                integerValuesAscending[3] = number3;

            }

        }

        for (int i=0; i < 3; i++){

            integerValuesDescending[i] = integerValuesAscending[2-i];

        }

        System.out.println("Ascending: " + Arrays.toString(integerValuesAscending));

        System.out.println("Descending: " + Arrays.toString(integerValuesDescending));

    }

}