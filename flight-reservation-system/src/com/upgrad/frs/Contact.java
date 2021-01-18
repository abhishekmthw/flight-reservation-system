package com.upgrad.frs;

public class Contact {
    String name;
    String phone;
    String email;

    String getContactDetails(){
        return name +  ", " + phone +  ", " + email;
    }

    void updateContactDetails(String contactDetails){
        name = contactDetails;
    }
}
