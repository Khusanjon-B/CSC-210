/*
Program Name: CarCareChoice.java

Description:  An application for Cody’s Car Care Shop that shows a user a list of available services: oil change, tire rotation, battery check, or brake inspection. Allow the user to enter a string that corresponds to one of the options, and display the option and its price as $25, $22, $15, or $5, accordingly. Display an error message if the user enters an invalid item

Author: Khusanjon Bobokhojaev

Last Modified: 04.23.2024

*/
import java.util.Scanner;

public class CarCareChoice {
    
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        
        String[] services = {"Oil Change", "Tire Rotation", "Battery Check", "Brake Inspection"};

        int[] prices = {25, 22, 15, 5};

        boolean check = false;

        String userInput;

        int userChoice = 0;

        System.out.println("Welcome to Cody\'s Car Care Shop!");

        do{

            System.out.println("Pick and type one of the services you will be purchasing today:");

            for(int i = 0; i < services.length; i++){

                System.out.println(services[i]);

            }

            System.out.println("_______________________________");

            System.out.println();

            System.out.print("---->");

            userInput = scanner1.nextLine();

            while(check == false){

                for(int i = 0; i < services.length; i++){

                    if(userInput.equalsIgnoreCase(services[i])){

                        check = true;

                        userChoice = i;

                    }

                }
            }

        } while(check == false);

        System.out.println("_______________________________");

        System.out.println();

        System.out.println("You picked " + services[userChoice] + " which will be $" + prices[userChoice]);

        scanner1.close();

    }

}
