package com.upgrad.frs;

public class Ticket {
    String pnr;
    String from;
    String to;
    Flight flight;
    String departureDateTime;
    String arrivalDateTime;
    Passenger passenger;
    String seatNo;
    float price;
    boolean cancelled;

    String checkStatus(){
        String status;
        if(cancelled){
            status = "Cancelled";
        }
        else{
            status = "Confirmed";
        }
        return status;
    }

    int getFlightDuration(){
        int duration = 0;
        return duration;
    }

    void cancel(){
        cancelled = true;
    }
}
