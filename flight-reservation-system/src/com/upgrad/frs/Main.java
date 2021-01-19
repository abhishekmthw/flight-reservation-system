package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("XXXX1234", "Airline", 100, 50);
        System.out.println(flight.getFlightDetails());

        TouristTicket tTicket = new TouristTicket("Hotel Address", new String[]{"Kochi", "Delhi", "Mumbai", null, null}, "1234qwer", "Delhi", "Kochi", "7", "10", "13B", 100.0f, false, "xxxx1234", "Indian Airlines", 100, 50, 1001, "Street", "City", "State", "Abhishek", "9876543210", "email@example.com");
        String locations = tTicket.getTouristLocations();
        System.out.println(locations);

        tTicket.addTouristLocations("Pune");
        System.out.println(tTicket.getTouristLocations());

        tTicket.removeTouristLocations("Delhi");
        System.out.println(tTicket.getTouristLocations());

        System.out.println(tTicket.getHotelAddress());

        System.out.println(tTicket.getFlight());

        System.out.println(tTicket.getPassenger());


/*
        Passenger passenger = new Passenger("Street", "City", "State", "Name", "Phone", "Email");
        System.out.println(passenger.getAddress());
        passenger.setAddress(new String[]{"City1", "City2", "City3"});
        System.out.println(passenger.getAddress());

        System.out.println(passenger.getContact());
        passenger.setContact(new String[]{"Name1", "Name2", "Name3"});
        System.out.println(passenger.getContact());
*/
    }
}
