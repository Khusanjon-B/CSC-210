public class PickTwoCard {
    
    public static void main(String[] args)
    {

        Card card1 = new Card();

        Card card2 = new Card();
        
        final int CARDS_IN_SUIT = 13;

        card1.setValue((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

        card2.setValue((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

        card1.setSuit(makeRand(0,3));

        card2.setSuit(makeRand(0,3));

        System.out.println("Two Randomly Generated Card:");

        System.out.println("Card 1: " + card1.getSuit() + " " + card1.getValue());

        System.out.println("Card 2: " + card2.getSuit() + " " + card2.getValue());

    }

    public static int makeRand(int MIN, int MAX) {
        
        int generatedNum = MIN + (int)(Math.random() * MAX);
    
        return generatedNum;

    }

}
