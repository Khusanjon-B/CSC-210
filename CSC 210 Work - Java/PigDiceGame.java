/*
Program Name: PigDiceGame.java

Description:

Using the Die class you created in Chapter 4, create a version of the dice game Pig that a user can play against the computer. The object of the game is to be the first to score 100 points. The user and computer take turns rolling a pair of dice following these rules:

• On a turn, each player “rolls” two dice. If no 1 appears, the dice values are added to a running total, and the player can choose whether to roll again or pass the turn to the other player.

• If a 1 appears on one of the dice, nothing more is added to the player’s total and it becomes the other player’s turn.

• If a 1 appears on both of the dice, not only is the player’s turn over, but the player’s entire accumulated score is reset to 0.

• In this version of the game, when the computer does not roll a 1 and can choose whether to roll again, generate a random value between 0 and 1. Have the computer continue to roll the dice when the value is 0.5 or more, and have the computer quit and pass the turn to the player when the value is not 0.5 or more.

Author: Khusanjon Bobokhojaev

Last Modified: 03.28.2024

*/


import java.util.ArrayList;
import java.util.Scanner;

public class PigDiceGame
{

    public static void main(String[] args) {

        //This is the section that creates the variables needed to store the information about the game
        
        Scanner scanner1 = new Scanner(System.in); //This is to track user input

        int turn = 0; //This is to keep track of whose turn it is, with 0 being the player and 1 being the person

        int playerScore = 0;

        int computerScore = 0;
    
        Die dice = new Die();

        ArrayList<Integer> playerRolls = new ArrayList<Integer>();

        ArrayList<Integer> computerRolls = new ArrayList<Integer>();

        String input = null;

        //This do/while loop is the opening to the game

        skipLine();
        skipLine();
            
        System.out.println("Welcome to the Dice Game!!");

        skipLine();

        do {

        System.out.println("When you are ready type Yes/No");

        skipLine();

        arrowIndicator();

        input = scanner1.nextLine();

        } while (input.equals("Yes") == false);


        //This section is to explain the game to the player

        System.out.println("The object of the game is to be the first to score 100 points");
        
        skipLine();

        System.out.println("Here are the rules of the game:");

        skipLine();

        System.out.println("On a turn, each player rolls two dice. If no 1 appears, the dice values are added to the running total, and the player can choose whether to roll again or pass the turn to the other player.");

        skipLine();

        System.out.println("If a 1 appears on one of the dice, nothing more is added to the player’s total and it becomes the other player’s turn.");

        skipLine();

        System.out.println("Ready? (Enter Yes/No)");

        input = scanner1.nextLine();

        if(input.equals("No")){

            while(input.equals("Yes") == false){

                System.out.println("Type Yes once ready...");

                arrowIndicator();

                input = scanner1.nextLine();

            }

        }

        //This section is where the actual game starts

        do {

            if(turn==0){

                rollSeparate();

                skipLine();

                System.out.println("Type Roll to roll your die");

                arrowIndicator();

                input = scanner1.nextLine();

                if(input.equals("Roll")){

                    dice.rerollDie();

                    playerRolls.add(dice.getDieRoll());

                    dice.rerollDie();

                    playerRolls.add(dice.getDieRoll());

                    System.out.println("You rolled a " + playerRolls.get(playerRolls.size() - 2) + " and a " + playerRolls.get(playerRolls.size() - 1));

                    skipLine();

                    if((playerRolls.get(playerRolls.size() - 2) == 1) && (playerRolls.get(playerRolls.size() - 1) == 1)){

                        System.out.println("Sorry, looks like you got two 1's, that means it is the computer's turn and your score will be reset to 0.");

                        playerScore = 0;

                        turn = 1;

                        skipLine();

                        displayScores(playerScore, computerScore);

                    } else if ((playerRolls.get(playerRolls.size() - 2) == 1) || (playerRolls.get(playerRolls.size() - 1) == 1)){

                        System.out.println("Looks like you got one 1, that means it is the computer's turn.");

                        turn = 1;

                        skipLine();

                        displayScores(playerScore, computerScore);

                    } else {

                        System.out.println("Good roll!");

                        skipLine();

                        playerScore = playerScore + playerRolls.get(playerRolls.size() - 2) + (playerRolls.get(playerRolls.size() - 1));

                        displayScores(playerScore, computerScore);

                        skipLine();

                        System.out.println("Would you like to roll again? (Yes/No)");

                        skipLine();

                        arrowIndicator();

                        input = scanner1.nextLine();

                        if(input.equals("Yes")){

                            turn = 0;

                        } else if (input.equals("No")) {

                            turn = 1;

                        } else {

                            do {

                                System.out.println("Would you like to roll again? (Yes/No)");

                                input = scanner1.nextLine();

                                if(input.equals("Yes")){

                                    turn = 0;

                                } else if(input.equals("No")){

                                    turn = 1;

                                }
                                
                            } while (((input.equals("Yes") == false) && (input.equals("No") == false)) &&((playerScore < 100) && (computerScore < 100)));

                        }

                    }

                }

            } else {

                do{

                    rollSeparate();

                    skipLine();


                    System.out.println("It is the computer's turn to roll");

                    dice.rerollDie();

                    computerRolls.add(dice.getDieRoll());

                    dice.rerollDie();

                    computerRolls.add(dice.getDieRoll());

                    System.out.println("The computer rolled a " + computerRolls.get(computerRolls.size() - 2) + " and a " + computerRolls.get(computerRolls.size() - 1));

                    skipLine();

                    if((computerRolls.get(computerRolls.size() - 2) == 1) && (computerRolls.get(computerRolls.size() - 1) == 1)){

                        System.out.println("Great! Looks like the computer got two 1's, that means it is your turn and the computer's score will be reset to 0.");

                        skipLine();

                        computerScore = 0;

                        turn = 0;

                        displayScores(playerScore, computerScore);

                        skipLine();

                    } else if ((computerRolls.get(computerRolls.size() - 2) == 1) || (computerRolls.get(computerRolls.size() - 1) == 1)){

                        skipLine();

                        System.out.println("Looks like the computer got one 1, that means it is your turn.");

                        turn = 0;

                        skipLine();

                        displayScores(playerScore, computerScore);

                    } else {

                        System.out.println("The computer made a good roll!");

                        skipLine();

                        computerScore = computerScore + computerRolls.get(computerRolls.size() - 2) + (computerRolls.get(computerRolls.size() - 1));

                        displayScores(playerScore, computerScore);

                        skipLine();

                        int randomNum = (int)(Math.random() * 2);

                        int pointDifference = computerScore - playerScore;

                        if(pointDifference <= 0){

                            System.out.println("The computer would like to roll again");
    
                            turn = 1;

                        } else {

                            if((randomNum == 1)){

                                System.out.println("The computer would like to roll again");
    
                                turn = 1;
    
                            } else {
    
                                System.out.println("The computer would not like to roll again");
    
                                turn = 0;
    
                            }

                        }

                    }

                } while((turn == 1) &&((playerScore < 100) && (computerScore < 100)));

            }

        } while ((playerScore < 100) && (computerScore < 100));

        //When the for loop ends, that means that one of the players won, so a conditional statement is run to determine which output to pick for winner of the game

        if (playerScore >= 100){

            System.out.println("CONGRATULATIONS YOU WIN!!!");

        } else if (computerScore >=100){

            System.out.println("Unfortunately you lost. :(");

        }

        scanner1.close();

    }

    public static void skipLine(){

        System.out.println();

    }

    public static void rollSeparate(){

        System.out.println("----------------------------------------------------------------");

    }

    public static void arrowIndicator() {

        System.out.print("--->");

    }

    public static void displayScores(int player, int computer){

        System.out.println("Your score is " + player);

        System.out.println("The computer's score is " + computer);

    }

}