/*
Program Name: Couple.java

Description:  Class named Couple that contains two Person objects.

Author: Khusanjon Bobokhojaev

Last Modified: 2.25.2024

*/

public class Couple {
    
    private Person personF;

    private Person personM;

    public void setCouple(Person bride, Person groom){

        personF = bride;

        personM = groom;

    }


    public String getBride(){

        return personF.getPerson();

    }

    public String getGroom(){

        return personM.getPerson();

    }

}
