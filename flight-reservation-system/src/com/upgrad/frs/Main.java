package com.upgrad.frs;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("XXXX1234", "Airline", 100, 50);
        System.out.println(flight.getFlightNumber() + " " + flight.getAirline() + " " + flight.getCapacity() + " " + flight.getBookedSeats());

    }
}
