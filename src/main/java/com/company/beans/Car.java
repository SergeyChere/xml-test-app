package com.company.beans;

import java.util.List;

public class Car {
    private String name;
    private String model;
    private int year;
    private List<String> countries;

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public Car(){}

    public Car(String name, String model, int year){
        this.name=name;
        this.model=model;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", countries=" + countries +
                '}';
    }
}
