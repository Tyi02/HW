package com.CSCI185;

public class Ninja {
    private String name;
    private String village;
    private String bloodLineType;
    private double bloodLineChakraCost;
    private double chakraPoints;
//default constructor
public Ninja()
{
    name = "No name yet";
    village = "No village yet";
    bloodLineType = "No blood line yet";
    bloodLineChakraCost = 1;
    chakraPoints = 10;
}
//parameterized constructor
public Ninja(String newName, String newVillage, String newBloodLineType,
             double newBloodLineChakraCost, double newChakraPoints)
{
    name = newName;
    village = newVillage;
    bloodLineType = newBloodLineType;
    bloodLineChakraCost = newBloodLineChakraCost;
    chakraPoints = newChakraPoints;
}
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getBloodLineType() {
        return bloodLineType;
    }

    public void setBloodLineType(String bloodLineType) {
        this.bloodLineType = bloodLineType;
    }

    public double getBloodLineChakraCost() {
        return bloodLineChakraCost;
    }

    public void setBloodLineChakraCost(double bloodLineChakraCost) {
        this.bloodLineChakraCost = bloodLineChakraCost;
    }

    public double getChakraPoints() {
        return chakraPoints;
    }

    public void setChakraPoints(double chakraPoints) {
        this.chakraPoints = chakraPoints;
    }
}
