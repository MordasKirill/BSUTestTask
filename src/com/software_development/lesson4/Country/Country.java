package com.software_development.lesson4.Country;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private City capital;
    private ArrayList<Region> regions;

    Country(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    void printNumberOfRegions() {
        System.out.println("There are " + this.regions.size() + " regions in " + countryName +".\n");
    }

    void printCapital() {
        System.out.println("The capital of " + countryName + " is" + capital+ ".\n");
    }

    void printArea() {
        double area = 0;
        for (Region region : regions) {
            area += region.getArea();
        }
        System.out.println("The area of " +countryName+" is"+ area +"thousand square kilometers.\n");
    }
    void printRegionCenters () {
        System.out.println("Regional centers of the: " + countryName);
        for (Region region : regions) {
            System.out.println(region.getRegionalName() + ", ");
        }
        System.out.println("\b\b.");
    }

    void addRegion (Region region) {
        regions.add(region);
    }

    void removeRegion (String regionName) {
        regions.removeIf(region -> regionName.equals(region.getRegionalName()));
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
