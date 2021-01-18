package com.upgrad.frs;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Address address = new Address();
        address.street = "Street";
        address.city = "City";
        address.state = "State";
        System.out.println(address.street + " " + address.city + " " + address.state);

        String street;
        Scanner sc = new Scanner(System.in);
        street = sc.nextLine();
        address.updateAddressDetails(street);
        System.out.println(address.street + " " + address.city + " " + address.state);

        Contact contact = new Contact();
        contact.name = "Name";
        contact.phone = "999999999";
        contact.email = "name@example.com";
        System.out.println(contact.name + " " + contact.phone + " " + contact.email);

        String name;
        name = sc.nextLine();
        contact.updateContactDetails(name);
        System.out.println(contact.name + " " + contact.phone + " " + contact.email);

        Flight flight = new Flight();
        flight.flightNumber = "XXXX1234";
        flight.airline = "Airline";
        flight.capacity = 100;
        flight.bookedSeats = 50;

        String flightDetails;
        flightDetails = flight.getFlightDetails();
        System.out.println(flightDetails);

        boolean availability = flight.checkAvailability();
        if(availability){
            System.out.println("Available!");
        }
        else{
            System.out.println("Not Available!");
        }

        flight.incrementBookingCounter();

        flightDetails = flight.getFlightDetails();
        System.out.println(flightDetails);

        TouristTicket tTicket = new TouristTicket();
        tTicket.selectedTouristLocation[0] = "Mumbai";
        tTicket.selectedTouristLocation[1] = "Bangalore";
        tTicket.selectedTouristLocation[2] = "Kochi";

        String locations;
        locations = tTicket.getTouristLocations();
        System.out.println(locations);

        tTicket.addTouristLocations("Delhi");
        locations = tTicket.getTouristLocations();
        System.out.println(locations);

        tTicket.addTouristLocations("Pune");
        locations = tTicket.getTouristLocations();
        System.out.println(locations);

        tTicket.addTouristLocations("Manali");
        locations = tTicket.getTouristLocations();
        System.out.println(locations);

        tTicket.removeTouristLocations("Kochi");
        locations = tTicket.getTouristLocations();
        System.out.println(locations);
    }
}
