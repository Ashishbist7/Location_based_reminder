package com.example.locationtracker;



public class Users {
    public String name;
    public String mobNo;

    public String country;

    public Users(){

    }

    public Users(String name, String mobNo, String country) {
        this.name = name;
        this.mobNo = mobNo;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getMobNo() {
        return mobNo;
    }


    public String getCountry() {
        return country;
    }
}
