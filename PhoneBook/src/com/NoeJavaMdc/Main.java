package com.NoeJavaMdc;
/*
18. Phone Book  ArrayList
Write a class named  PhoneBookEntry that has fields for a person’s name and phone number.
The class should have a constructor and appropriate accessor and mutator methods. Then
write a program that creates at least five  PhoneBookEntry objects and stores them in an ArrayList .
Use a loop to display the contents of each object in the  ArrayList .
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PhoneBookEntry> list = new ArrayList<>();
        list.add( new PhoneBookEntry("Noe",    786123456789l) );
        list.add( new PhoneBookEntry("Sarah",  786123456789l) );
        list.add( new PhoneBookEntry("Albert", 786123456789l) );
        list.add( new PhoneBookEntry("Fulano", 786123456789l) );
        list.add( new PhoneBookEntry("Hellen", 786123456789l) );
   for(PhoneBookEntry i:list ) System.out.println(i);


    }
}
