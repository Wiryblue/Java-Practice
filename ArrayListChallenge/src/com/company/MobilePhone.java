package com.company;

import java.net.HttpURLConnection;
import java.util.ArrayList;

public class MobilePhone {
    String MyNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        MyNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean createContact (Contact contact) {
            if (findContact(contact.getContactName())>= 0)
            {
                System.out.println("Contact already added");
                return false;
            }
            myContacts.add(contact);
            return true;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0){
            System.out.println("Contact not Found");
            return false;
        }
        return true;
    }
    public boolean removeContact (Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition < 0){
            System.out.println("Contact not Found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getContactName() + " was Deleted.");
        return true;
    }

    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String contactname){
        for(int i = 0; i <this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
                    if (contact.getContactName() == contactname){
                        return i;
                    }
        }
        return -1;

    }
    public String queryContact(Contact contact){

        if(findContact(contact)>= 0){
            return contact.getContactName();

        }
        return null;
    }
}
