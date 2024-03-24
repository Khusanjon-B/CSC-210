/*
Program Name: TestWedding.java

Description:  A program that creates two Wedding objects and in turn passes each to a method that displays all the details

Author: Khusanjon Bobokhojaev

Last Modified: 02.25.2024

*/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestWedding {
    
    public static void main(String[] args) {

        Person bride = new Person();

        Person groom = new Person();

        Scanner weddingInfo = new Scanner(System.in);

        System.out.println("Enter the Bride's First Name");

        bride.setFirstName(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(bride.getFirstName());

        System.out.println("Enter the Bride's Last Name");

        bride.setLastName(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(bride.getLastName());

        System.out.println("Enter the Bride's Birthdate (yyyy-MM-dd)");

        bride.setBirthday(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(bride.getBirthday());

        System.out.println("Enter the Groom's First Name");

        groom.setFirstName(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(groom.getFirstName());

        System.out.println("Enter the Groom's Last Name");

        groom.setLastName(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(groom.getLastName());

        System.out.println("Enter the Groom's Birthdate (yyyy-MM-dd)");

        groom.setBirthday(weddingInfo.nextLine());

        //Debuggging Statement - Function Above Works - System.out.println(groom.getBirthday());

        Couple couple1 = new Couple();

        couple1.setCouple(bride, groom);

        // Debugging Statement - Function Tested Fixed - System.out.println(couple1.getBride());

        // Debugging Statement - Function Tested Fixed - System.out.println(couple1.getGroom());

        // Debugging Statement - Function Tested Fixed - System.out.println(bride.getPerson());

        // Debugging Statement - Function Tested Fixed - System.out.println(groom.getPerson());

        Wedding wedding1 = new Wedding();

        wedding1.setCoupleNames(bride, groom);

        // Debugging Statement - Function Tested Fixed - System.out.println(wedding1.getCoupleNames());

        System.out.println("Enter the Wedding Date (yyyy-MM-dd)");

        wedding1.setWeddingDay(weddingInfo.nextLine());

        // Debugging Statement - Function Tested Fixed - System.out.println(wedding1.getWeddingDay());

        System.out.println("Enter the Wedding location");

        wedding1.setWeddingLocation(weddingInfo.nextLine());

        // Debugging Statement - Function Tested Fixed - System.out.println(wedding1.getWeddingLocation());

        weddingInfo.close();

        JOptionPane.showMessageDialog(null,"Wedding for " + wedding1.getCoupleNames() + "\n" + "Bride: " + couple1.getBride() + "\n" + "Groom: " + couple1.getGroom() + "\n" + "Date: " + wedding1.getWeddingDay() + "\n" + "Location: " + wedding1.getWeddingLocation());

    }

}