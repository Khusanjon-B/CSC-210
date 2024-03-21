import javax.swing.JOptionPane;

public class RandomGuessMatch {
    
    public static void main(String[] args) {
        
        int MIN = 1;
        int MAX = 5;

        int random = MIN + (int)(Math.random() * MAX);

        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 1 and 5 below"));

        if (number == random) {

            JOptionPane.showMessageDialog(null,"Right on the dot!!");

        } else {

            int error;

            if (number<random){

                error = random - number;

            } else {

                error = number - random;

            }

            JOptionPane.showMessageDialog(null,"Unfortunately, your guess was " + number + ". The correct number was " + random +
            ". You were " + error + " off.");

        }

    }

}
