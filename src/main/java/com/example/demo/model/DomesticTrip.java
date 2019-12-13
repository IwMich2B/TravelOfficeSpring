package com.example.demo.model;

public class DomesticTrip extends Trip {
    private double ownArrivalDiscount;

    public DomesticTrip(MyDate start, MyDate end, String destinations, double price, double ownArrivalDiscount) {
        super(start, end, destinations, price);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }



    public void setOwnArrivalDiscount(double ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * ownArrivalDiscount;
    }
}
