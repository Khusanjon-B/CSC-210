/*
Program Name: Patient.java

Description: Class named Patient that includes an ID number, age, and BloodData

Author: Khusanjon Bobokhojaev

Last Modified: 02.27.24

*/

public class Patient {
    
    private int ID;

    private int age;

    private BloodData bloodData;

    public Patient(int ID, byte age, String type, String rhFactor){

        this.ID = ID;

        this.age = age;

        this.bloodData.setBloodData(type, rhFactor);

    }

    public Patient(){

        ID = 0;

        age = 0;

        bloodData = new BloodData("O", "+");

    }

    public void setPatientID(int ID){

        this.ID = ID;

    }

    public void setPatientAge(int age){

        this.age = age;

    }

    public void setPatientBloodData(String type, String rhFactor){

        this.bloodData.setBloodData(type, rhFactor);

    }

    public String getPatientData(){

        return "ID: " + ID + "\n" + "Age: " + age + "\n" + "Blood Data: " + bloodData.getBloodData();

    }

    public int getPatientID(){

        return ID;

    }

    public int getPatientAge(){

        return age;

    }

    public String getPatientBloodData(){

        return bloodData.getBloodData();

    }

}
