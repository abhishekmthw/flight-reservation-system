package com.upgrad.frs;

public class TouristTicket {
    
    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];

    String getHotelAddress(){
        return hotelAddress;
    }

    String getTouristLocations(){
        int i;
        String locations = "Locations: ";
        for(i = 0; i < 5; i++){
            if(selectedTouristLocation[i] != null) {
                locations = locations + selectedTouristLocation[i] + ", ";
            }
        }
        return locations;
    }

    void removeTouristLocations(String location){
        boolean found = false;
        for(int i = 0; i < 5; i++){
            if(selectedTouristLocation[i].equals(location)){
                selectedTouristLocation[i] = null;
                found = true;
                System.out.println("Location removed!");
                break;
            }
        }
        if(!found){
            System.out.println("Location not found!");
        }
    }

    void addTouristLocations(String location){
        int i;
        for(i = 0; i < 5; i++){
            if(selectedTouristLocation[i] == (null)){
                selectedTouristLocation[i] = location;
                System.out.println("Location added!");
                break;
            }
        }
        if(i == 5){
            System.out.println("Maximum locations entered!");
        }

    }
}
