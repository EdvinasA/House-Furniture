package com.company1;

public class House {

    private String name;
    private Room kitchen;
    private Room bedroom;
    private Room bathroom;
    private Room extraRooms;

    public House(String name, Room kitchen, Room bedroom, Room bathroom, Room extraRooms) {
        this.name = name;
        this.kitchen = kitchen;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.extraRooms = extraRooms;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public Room getExtraRooms() {
        return extraRooms;
    }

    public String getName() {
        return name;
    }


}
