/*
Program Name: QueenOfTheSky.java.

Description: Program to demonstrate that the constructors work, by instantiating an object and displaying the initial values for all fields.

Author:

Last Modified:

*/

public class QueenOfTheSky {
    
    public static void main(String[] args) {
        
        JumboJet jetOne = new JumboJet();

        System.out.println("This is the initial values of the jet " + '\n' + jetOne.getJet());

        System.out.println("These are the same values but with the get methods for each attribute:");

        System.out.println(jetOne.getJetAircraftModel());

        System.out.println(jetOne.getJetAircraftSeats());

        System.out.println(jetOne.getJetAircraftTankCapacity());

        System.out.println(jetOne.getJetAircraftEfficiency());

    }

}
