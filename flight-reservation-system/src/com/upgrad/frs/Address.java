package com.upgrad.frs;

public class Address {
    String street;
    String city;
    String state;

    String getAddressDetails(){
        return street + ", " + city +  ", " + state;
    }

    void updateAddressDetails(String addressDetail){
        street = addressDetail;
    }
}
