import javax.swing.JOptionPane;

public class RandomGuess {
    
    public static void main(String[] args)
    {
        //These are the integer variables that will be used for the game. The number variable is to record the user's input

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 1 and 10:"));

        int rndNumber = (1 + (int)(Math.random() * 10));

        //The following if statement will be used to select an output based on the user's input

        if (number == rndNumber) {

            JOptionPane.showMessageDialog(null,"Right on the dot!! " + number);

        } else {

            JOptionPane.showMessageDialog(null,"Unfortunately, your guess was " + number + ". The correct number was " + rndNumber);

        }

    }

}
