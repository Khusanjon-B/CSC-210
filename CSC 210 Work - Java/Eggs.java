import javax.swing.JOptionPane;

public class Eggs {
    
    public static void main(String[] args) {
        
        final double DOZEN_EGGS = 3.250;

        final double LOOSE_EGG = 0.450;

        int numberEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs would you like to buy today?"));

        int numberOfDozen = numberEggs/12;

        int numberOfLoose = numberEggs%12;

        double price = numberOfDozen*DOZEN_EGGS+numberOfLoose*LOOSE_EGG;

        JOptionPane.showMessageDialog(null,"You ordered " + numberEggs + ". That is " + numberOfDozen + " dozen at $3.25 per dozen and " + numberOfLoose + " loose eggs at 45 cents each for a total of $" + price + ".");

    }

}
