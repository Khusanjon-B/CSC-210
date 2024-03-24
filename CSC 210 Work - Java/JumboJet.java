/*
Program Name: JumboJet.java

Description:

A JumboJet has fields (1) aircraft model as a String, (2) number of seats as an Integer, (3) fuel tank capacity as an Integer, and (4) fuel efficiency as a double.  Please include individual set method for each of the fields, where fuel efficiency can only be set as division of the fuel tank capacity by the number of seats.  Individual get method for each of the fields are to be included in the class as well.  Also included in the JumboJet class are two constructors. The first constructor defaults each JumboJet's aircraft model to B747, number of seats to 365, and fuel tank capacity to 183380. The second constructor accepts user’s inputs for aircraft model, number of seats, and fuel tank capacity.

Author: Khusanjon Bobokhojaev

Last Modified: 03.19.2024

*/

public class JumboJet {
    
    private String aircraftModel;

    private int aircraftSeats;

    private int aircraftTankCapacity;

    private double aircraftFuelEfficiency;

    public JumboJet(){

        aircraftModel = "B747";

        aircraftSeats = 365;

        aircraftTankCapacity = 183380;

        aircraftFuelEfficiency = aircraftTankCapacity/aircraftSeats;

    }

    public void setJumboJet(String model, int seats, int capacity){

        aircraftModel = model;

        aircraftSeats = seats;

        aircraftTankCapacity = capacity;

        aircraftFuelEfficiency = capacity/seats;

    }

    public void setJetAircraftModel(String model){

        aircraftModel = model;

    }

    public String getJetAircraftModel(){

        return aircraftModel;

    }

    public void setJetAircraftSeats(int seats){

        aircraftSeats = seats;

        aircraftFuelEfficiency = aircraftTankCapacity/seats;

    }

    public int getJetAircraftSeats(){

        return aircraftSeats;

    }

    public void setJetAircraftTankCapacity(int capacity){

        aircraftTankCapacity = capacity;

        aircraftFuelEfficiency = capacity/aircraftSeats;

    }

    public int getJetAircraftTankCapacity(){

        return aircraftTankCapacity;

    }

    public void setJetAircraftEfficiency(){

        aircraftFuelEfficiency = aircraftTankCapacity/aircraftSeats;

    }

    public double getJetAircraftEfficiency(){

        return aircraftFuelEfficiency;

    }

    String sp = " - ";

    public String getJet(){

        return aircraftModel + sp + aircraftSeats + sp + aircraftTankCapacity + sp + aircraftFuelEfficiency;

    }

}
