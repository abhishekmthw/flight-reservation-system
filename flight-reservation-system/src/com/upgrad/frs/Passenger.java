package com.upgrad.frs;

public class Passenger {

    private int id;
    private Address address;
    private Contact contact;
    private Flight flight;

    private static  int idCounter;

    private static class Address {
        private String street;
        private String city;
        private String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        String getAddressDetails(){
            return street + ", " + city +  ", " + state;
        }

        void updateAddressDetails(String addressDetail){
            street = addressDetail;
        }
    }

    private static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        String getContactDetails(){
            return name +  ", " + phone +  ", " + email;
        }

        void updateContactDetails(String contactDetails){
            name = contactDetails;
        }
    }

    public Passenger(String street, String city, String state, String name, String phone, String email){
        Address address = new Address(street, city, state);
        this.address = address;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;

        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    void getContact(){
        String details = contact.getContactDetails();
        System.out.println(details);
    }

    void getAddress(){
        String details = address.getAddressDetails();
        System.out.println(details);
    }

    int getPassengerCount(){
        return idCounter;
    }
}
