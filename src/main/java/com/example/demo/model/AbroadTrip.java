package com.example.demo.model;

public class AbroadTrip extends Trip {
    private double insurance;



    public AbroadTrip(MyDate start, MyDate end, String destinations, double price, double insurance) {
        super(start, end, destinations, price);
        this.insurance = insurance;
    }
    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }
}
