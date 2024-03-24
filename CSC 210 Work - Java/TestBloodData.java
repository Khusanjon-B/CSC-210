/*
Program Name: TestBloodData.java

Description: Demonstrates use of the BloodData class

Author: Khusanjon Bobokhojaev

Last Modified: 2.22.2024

*/

public class TestBloodData {
    
    public static void main(String[] args) {
        
        BloodData person1 = new BloodData();

        System.out.println("This is the default constructor: " + person1.getBloodData());

        BloodData person2 = new BloodData("AB","+");

        System.out.println("This is the default constructor with parameters: " + person2.getBloodData());

        person1.setBloodData("A","-");

        System.out.println("This is the use of the set and get methods for both attributes of the object: " + person1.getBloodData());

        person1.setBloodType("B");

        System.out.println("This is the use of the set and get methods for the blood type: " + person1.getBloodType());

        person1.setRhFactor("+");

        System.out.println("This is the use of the set and get methods for the Rh factor: " + person1.getRhFactor());

    }
    
}
