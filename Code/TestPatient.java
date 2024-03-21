/*
Program Name: TestPatient.java

Description: Application of Patient.java

Author: Khusanjon Bobokhojaev

Last Modified: 02.27.24

*/

public class TestPatient {
    
    public static void main(String[] args) {
        
        Patient khusanjon = new Patient();

        System.out.println("This is default Patient Constructor: " + "\n" + khusanjon.getPatientData());

        khusanjon.setPatientID(1234);

        khusanjon.setPatientAge(18);

        khusanjon.setPatientBloodData("A", "-");

        System.out.println("This is the set and get methods: " + "\n" + data(khusanjon));
        
    }

    public static String data(Patient patient) {
        
        return "ID: " + patient.getPatientID() + "\n" + "Age: " + patient.getPatientAge() + "\n" + "Blood Data: " + patient.getPatientBloodData();

    }

}
