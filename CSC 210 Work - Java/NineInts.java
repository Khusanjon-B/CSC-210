/*
Program Name: NineInts.java

Description: An application that stores nine integers in an array. Displays the integers from first to last, and then displays the integers from last to first.

Author: Khusanjon Bobokhojaev

Last Modified: 04.18.2024

*/

public class NineInts {
    
    public static void main(String[] args) {


        
        int[] intList = {12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("This is the integer list: ");

        System.out.println();

        for (int i = 0; i < intList.length; i++){

            if (i==8){

                System.out.print(intList[i] + ".");

            } else {

                System.out.print(intList[i] + ", ");

            }

        }

        System.out.println();

        System.out.println("This is the integer list reversed: ");

        System.out.println();

        for (int i = intList.length; i > 0; i--){

            if (i==1){

                System.out.print(intList[i-1] + ".");

            } else {

                System.out.print(intList[i-1] + ", ");

            }

        }

    }

}
