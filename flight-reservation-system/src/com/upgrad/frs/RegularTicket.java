package com.upgrad.frs;

public class RegularTicket {
    String specialServices;

    String getSpecialService(){
        return specialServices;
    }

    void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }
}
