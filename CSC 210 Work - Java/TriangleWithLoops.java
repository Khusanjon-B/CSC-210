/*
Program Name: TriangleWithLoops.java

Description: In Chapter 1 you created a program named Triangle in which you displayed a seven-line triangle pattern like the one in Figure 6-33 by using a series of println() statements. Now, using your knowledge of loops, revise the program so that it contains no more than three output statements

Author: Khusanjon Bobokhojaev

Last Modified: 03.26.2024

      T
     TTT
    TTTTT
   TTTTTTT
  TTTTTTTTT
 TTTTTTTTTTT
TTTTTTTTTTTTT

*/

public class TriangleWithLoops{

    public static void main(String[] args) {

        int spaces = 6;
        int numTs = 1;
        int lines = 7;

        for(int i = 0; i < lines; i++){

            for(int j = 0; j < spaces; j++){

                System.out.print(" ");

            }

            spaces--;

            for(int k = numTs; k > 0; k--){

                System.out.print("T");

            }
            numTs = numTs + 2;

            System.out.println("");

        }

    }

}