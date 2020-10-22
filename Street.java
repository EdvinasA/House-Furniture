package com.company1;

public class Street {

    private String town;
    private House house1;
    private House house2;
    private House house3;
    private House house4;

    public Street(String town, House house1, House house2, House house3, House house4) {
        this.town = town;
        this.house1 = house1;
        this.house2 = house2;
        this.house3 = house3;
        this.house4 = house4;
    }

    public House getHouse1() {
        return house1;
    }

    public House getHouse2() {
        return house2;
    }

    public House getHouse3() {
        return house3;
    }

    public House getHouse4() {
        return house4;
    }

    public String getTown() {
        return town;
    }



}
