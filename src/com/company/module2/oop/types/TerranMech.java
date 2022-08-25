package com.company.module2.oop.types;

// This is an abstract class, it cannot be instantiated
public abstract class TerranMech {
    // fields
    private double maxSpeed;
    private int attackDamage;

    // constructor
    public TerranMech(double maxSpeed, int attackDamage){
        this.maxSpeed = maxSpeed;
        this.attackDamage = attackDamage;
    }

    public abstract void callInMedivac();

    /**
     * Calls in an orbital strike from a battlecruiser in orbit
     */
    public void callInOrbitalStrike(){
        System.out.println("Yamato cannon charging!");
    }

    // getters
    protected double getMaxSpeed() {
        return maxSpeed;
    }

    protected int getAttackDamage() {
        return attackDamage;
    }
}
