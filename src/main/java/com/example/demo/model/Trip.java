package com.example.demo.model;

public class Trip {
    private MyDate startTrip;
    private MyDate endTrip;
    private String destinations;
    private double price;

    public Trip() {
    }

    public Trip(MyDate start, MyDate end, String destinations, double price) {
        this.startTrip = start;
        this.endTrip = end;
        this.destinations = destinations;
        this.price = price;
    }

    public MyDate getStartTrip() {
        return startTrip;
    }

    public void setStartTrip(MyDate startTrip) {
        this.startTrip = startTrip;
    }

    public MyDate getEndTrip() {
        return endTrip;
    }

    public void setEndTrip(MyDate endTrip) {
        this.endTrip = endTrip;
    }

    public String getDestinations() {
        return destinations;
    }

    public void setDestinations(String destinations) {
        this.destinations = destinations;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Trip start: " + startTrip.toString() + ", " + "Trip end: " + endTrip.toString() + ", " + "Destinations: " + destinations + ", " + "Price: " + getPrice();
    }
}
