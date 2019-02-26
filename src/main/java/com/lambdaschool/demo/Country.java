package com.lambdaschool.demo;

import java.util.concurrent.atomic.AtomicLong;

public class Country {

    private static AtomicLong counter = new AtomicLong();
    private long id;
    private String name;
    private double population;
    private double landMass;
    private int medianAge;

    public Country(String name, double population, double landMass, int medianAge) {

        this.id = counter.incrementAndGet();
        this.name = name;
        this.population = population;
        this.landMass = landMass;
        this.medianAge = medianAge;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getLandMass() {
        return landMass;
    }

    public void setLandMass(double landMass) {
        this.landMass = landMass;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }
}
