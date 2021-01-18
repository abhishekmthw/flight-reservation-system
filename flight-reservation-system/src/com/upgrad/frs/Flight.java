package com.upgrad.frs;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    String getFlightDetails(){
        return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    boolean checkAvailability(){
        boolean availability = false;
        if(bookedSeats < capacity) {
            availability = true;
        }
        return availability;
    }

    void incrementBookingCounter(){
        ++bookedSeats;
    }
}
