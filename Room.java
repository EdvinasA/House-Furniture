package com.company1;

public class Room {

    private String size;
    private Furniture table;
    private Furniture chair;
    private Furniture wardrobe;


    public Room(String size, Furniture table, Furniture chair,Furniture wardrobe) {
        this.size = size;
        this.table = table;
        this.chair = chair;
        this.wardrobe = wardrobe;
    }

    public String getSize() {
        return size;
    }

    public Furniture getTable() {
        return table;
    }

    public Furniture getChair() {
        return chair;
    }

    public Furniture getWardrobe() {
        return wardrobe;
    }


}
