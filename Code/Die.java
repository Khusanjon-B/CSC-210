/*
Program Name: Die.java

Description: A Die class that can hold an integer data field for a value (from 1 to 6)

Author: Khusanjon Bobokhojaev

Last Modified: 03.03.2024

*/

public class Die {

    private int value;

    final int HIGHEST_DIE_VALUE = 6;

    final int LOWEST_DIE_VALUE = 1;

    public Die(){

        value = assignRandomValue();

    }

    public void rerollDie(){

        value = assignRandomValue();

    }

    public int getDieRoll(){

        return value;

    }

    public int assignRandomValue(){

        return ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

    }

}
