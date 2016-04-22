package com.NoeJavaMdc;

/**
 * Created by Noe on 4/21/2016.
 */
public class PhoneBookEntry {


    private String name;
    private long phoneNumber;

    public PhoneBookEntry(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Hi " + name  +
                ", Here is Your phone number: " + phoneNumber;
    }
}
