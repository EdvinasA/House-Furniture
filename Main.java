package com.company1;

public class Main {

    public static void main(String[] args) {

        Furniture table = new Furniture("The beast", "4x4x4");
        Furniture table1 = new Furniture("The fluffy", "4x4x4");
        Furniture table2 = new Furniture("The mountain", "4x4x4");
        Furniture table3 = new Furniture("The fabric", "4x4x4");
        Furniture chair = new Furniture("The comfy", "4x6x6");
        Furniture chair1 = new Furniture("The worst", "4x6x6");
        Furniture chair2 = new Furniture("The best", "4x6x6");
        Furniture chair3 = new Furniture("The dirtiest", "4x6x6");
        Furniture wardrobe = new Furniture("The giant", "12x12x12");
        Furniture wardrobe1 = new Furniture("The small", "12x12x12");
        Furniture wardrobe2 = new Furniture("The big", "12x12x12");
        Furniture wardrobe3 = new Furniture("The smelly", "12x12x12");

        Furniture [] tableArray = {table,table1,table2,table3};
        Furniture [] chairArray = {chair,chair1,  chair2, chair3};
        Furniture [] wardrobeArray = {wardrobe,wardrobe1,wardrobe2,wardrobe3};

        Room kitchen = new Room("120x120",table1,chair,wardrobe1);
        Room bathroom = new Room("120x120",table2,chair1,wardrobe2);
        Room bedroom = new Room("120x120",table3,chair2,wardrobe3);
        Room extraRoom = new Room("120x120",table,chair3,wardrobe);

        House mayers = new House("Hummer",kitchen,bathroom,bedroom,extraRoom);
        House darling = new House("Dark",kitchen,bathroom,bedroom,extraRoom);
        House mine = new House("Clear",kitchen,bathroom,bedroom,extraRoom);
        House minions = new House("Worst", kitchen,bathroom,bedroom,extraRoom);

        Street kaunas = new Street("Kaunas", mayers, darling, mine, minions);


        kaunas.getHouse1();
        printInformation(kaunas);




    }

    public static void printInformation (Street street) {


        System.out.println(street.getHouse1().getName() + ". Chair :" + street.getHouse1().getBedroom().getChair().getName() +  ". Table " + street.getHouse1().getBedroom().getTable().getName()
                + ". Wardrobe: " + street.getHouse1().getBedroom().getWardrobe().getName());
        System.out.println(street.getHouse2().getName() + ". Chair :" + street.getHouse2().getBathroom().getChair().getName()+  ". Table " + street.getHouse2().getBathroom().getTable().getName()
                + ". Wardrobe: " + street.getHouse2().getBathroom().getWardrobe().getName());
        System.out.println(street.getHouse3().getName() + ". Chair :" + street.getHouse3().getKitchen().getChair().getName()+  ". Table " + street.getHouse3().getKitchen().getTable().getName()
                + ". Wardrobe: " + street.getHouse3().getKitchen().getWardrobe().getName());
        System.out.println(street.getHouse4().getName() + ". Chair :" + street.getHouse4().getExtraRooms().getChair().getName()+  ". Table " + street.getHouse4().getExtraRooms().getTable().getName()
                + ". Wardrobe: " + street.getHouse4().getExtraRooms().getWardrobe().getName());

    }
}
