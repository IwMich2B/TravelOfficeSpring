package com.example.demo.model;

public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;


    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public Trip getTrip() {
        return trip;
    }
    public String toString() {
        return "name: " + name + ", " + "address: " + address.toString() + ", " + "trip: " + trip.toString();
    }
}
