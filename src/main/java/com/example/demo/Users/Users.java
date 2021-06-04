package com.example.demo.Users;

import java.time.LocalDate;

public class Users {
    private int id;
    private String name;
    private String familyName;
    private LocalDate dob;
    private String address;

    public Users() {
    }

    public Users(String name, String familyName, LocalDate dob, String address) {
        this.name = name;
        this.familyName = familyName;
        this.dob = dob;
        this.address = address;
    }

    public Users(int id, String name, String familyName, LocalDate dob, String address) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.dob = dob;
        this.address = address;
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

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return this.id + " " + getName() + " " + getFamilyName() + " " + this.dob+ " " + getAddress();
    }

}
