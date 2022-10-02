package com.company;

public class Contact {
    String ContactName;
    String PhoneNumber;

    public Contact(String contactName, String phoneNumber) {
        ContactName = contactName;
        PhoneNumber = phoneNumber;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public static Contact createContact (String ContactName, String PhoneNumber){
        return new Contact(ContactName,PhoneNumber);
    }
}
