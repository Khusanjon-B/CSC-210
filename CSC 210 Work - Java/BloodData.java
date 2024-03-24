/*
Program Name: BloodData.java

Description:  Class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and -). Includes a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field

Author: Khusanjon Bobokhojaev

Last Modified: 2.22.2024

*/

public class BloodData {
    
    private String bloodType;

    private String rhFactor;

    public BloodData(String type, String rh){

        bloodType = type;

        rhFactor = rh;

    }

    public BloodData() {

        this("O","+");

    }

    public void setBloodData(String type, String rh){

        bloodType = type;

        rhFactor = rh;

    }

    public void setBloodType(String type){

        bloodType = type;

    }

    public void setRhFactor(String rh){

        rhFactor = rh;

    }

    public String getBloodData(){

        return "Type: " + bloodType + ". Rh: " + rhFactor;

    }

    public String getBloodType(){

        return bloodType;

    }

    public String getRhFactor(){

        return rhFactor;

    }

}
