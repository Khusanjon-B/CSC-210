/*
Program Name: Person.java

Description:  Class named Person that holds the following fields: two String objects for the person's first and last name and a LocalDate object for the person's birthdate.

Author: Khusanjon Bobokhojaev

Last Modified: 2.25.2024

*/

import java.time.LocalDate;

public class Person {
    
    private String firstName;

    private String lastName;
    
    private LocalDate birthday;

    public void setPerson(String first, String last, LocalDate date){

        firstName = first;

        lastName = last;

        birthday = date;

    }

    public String getPerson(){

        return firstName + " " + lastName + "\n" + " DOB: " + birthday;

    }

    public void setFirstName(String first) {

        firstName = first;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {

        return lastName;

    }

    public void setBirthday(String date){

        birthday = LocalDate.parse(date);

    }

    public LocalDate getBirthday(){

        return birthday;

    }

}
