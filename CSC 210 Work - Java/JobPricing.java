/*
Program Name: JobName.java

Description: Class that contains a main() method that prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time. Pass the numeric data to a method that computes estimate for the job and returns the computed value to the main() method where the job name and estimated price are displayed.

Author: Khusanjon Bobokhojaev

Last Modified: 02.29.2024

*/

import javax.swing.JOptionPane;

public class JobPricing
{

    public static void main(String[] args) {
    
        String job = JOptionPane.showInputDialog(null, "Enter the job name");

        float materials = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the materials cost"));

        int hoursWork = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hours of work needed to complete the job"));

        int hoursTravel = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of hours of travel time"));

        JOptionPane.showMessageDialog(null,returnPrice(job, materials, hoursWork, hoursTravel));

    }

    public static String returnPrice(String  jobName, float materialCost, int hoursOfWork, int hoursOfTravel){

        final int COST_PER_HOUR = 35;

        final int COST_PER_HR_TRAVEL = 12;

        float totalCost = materialCost + hoursOfWork*COST_PER_HOUR + hoursOfTravel*COST_PER_HR_TRAVEL;

        return "The cost for " + jobName + " is $" + totalCost;

    }

}