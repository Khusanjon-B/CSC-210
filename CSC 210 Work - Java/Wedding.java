/*
Program Name: Wedding.java

Description:  Class named Wedding for a wedding planner that includes the date of the wedding, the names of the Couple being married, and a String for the location

Author: Khusanjon Bobokhojaev

Last Modified: 2.25.2024

*/

import java.time.LocalDate;

public class Wedding {
    
    private LocalDate dateOfWedding;

    private String coupleNames;

    private String location;

    public void setWeddingDay(String date){

        dateOfWedding = LocalDate.parse(date);

    }

    public LocalDate getWeddingDay(){

        return dateOfWedding;

    }

    public void setCoupleNames(Person bride,Person groom){

        coupleNames = groom.getFirstName() + " and " + bride.getFirstName();

    }

    public String getCoupleNames(){

        return coupleNames;

    }

    public void setWeddingLocation(String location){

        this.location = location;

    }

    public String getWeddingLocation(){

        return location;

    }

}
