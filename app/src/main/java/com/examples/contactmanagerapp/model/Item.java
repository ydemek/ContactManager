package com.examples.contactmanagerapp.model;

public class Item {
    private int id;
    private String name;
    private String number;

    public Item() {
    }

    public Item(String name, String number, int itemQuantity, int itemSize, String dateItemAdded) {
        this.name = name;
        this.number = number;
    }

    public Item(int id, String name, String number, int itemQuantity, int itemSize, String dateItemAdded) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
