package com.di.xpgold.classes;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Car() {
        super();
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) throws Exception {

        Car firstCar = new Car();
        System.out.println(" ----- call displayCarInfo with empty constructor ------");
        firstCar.displayCarInfo();

        Car secondCar = new Car("Fiat", "City cross", 2019);
        System.out.println(" ----- call displayCarInfo with three parameters in constructor -----");
        secondCar.displayCarInfo();

        Car threeCard = new Car("Jaguar", "E-pace", 2017, "gray", 55654);
        System.out.println(" ----- call displayCarInfo all parameters in constructor -----");
        threeCard.displayCarInfo();

    }

    public void displayCarInfo() {
        System.out.printf("Make : <%s> , Model : <%s> , Year : <%d> , Color : <%s> , Price : <%f>", this.make,
                this.model, this.year, this.color, this.price);
    }

}
