package com.CSCI185;

/**
 * Creates Shinbois to do attacks
 * @author Terry Yi
 * @Version 1.0
 * @since 3-10-22
 */
public class Ninja {
    private String name;
    private String village;
    private String bloodLineType;
    private double chakraPoints;
    private double bloodLineChakraCost;

    //default constructor
    public Ninja()
    {
        name = "No name yet";
        village = "No village yet";
        bloodLineType = "No blood line yet";
        chakraPoints = 1;
        bloodLineChakraCost = 1;
    }
    //parameterized constructor
    public Ninja(String newName, String newVillage, String newBloodLineType,
                 double newChakraPoints, double newBloodLineChakraCost)
    {
        name = newName;
        village = newVillage;
        bloodLineType = newBloodLineType;
        chakraPoints = newChakraPoints;
        bloodLineChakraCost = newBloodLineChakraCost;
    }
    //accessors and mutators
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

    public double getChakraPoints() {
        return chakraPoints;
    }

    public void setChakraPoints(double chakraPoints) {
        this.chakraPoints = chakraPoints;
    }

    public double getBloodLineChakraCost() {
        return bloodLineChakraCost;
    }

    public void setBloodLineChakraCost(double bloodLineChakraCost) {
        this.bloodLineChakraCost = bloodLineChakraCost;
    }

    //this method does the attack for the shinobi
    //Also it checks if the shinobi has enough chakra points to do the attack
    public void bloodlineAttack()
    {

        if(this.chakraPoints<=this.bloodLineChakraCost)
        {
            System.out.println(name+" cannot use "+bloodLineType+ "\nNot enough available Chakra points");

        }
        else if(this.chakraPoints>0)
        {
            System.out.println("---------------------------------------\n");
            this.chakraPoints -= this.bloodLineChakraCost;
            System.out.println(name+" uses "+bloodLineChakraCost+" chakra points to use "+bloodLineType+"!"+
                    "\n"+ name+" "+"has "+ this.chakraPoints+" Chakra points left.");

        }
    }
    //Just simple shinobi trick
    public void ShinobiTrick()
    {
        System.out.println(name+" from "+village+" uses substitution jutsu.");
    }

}

