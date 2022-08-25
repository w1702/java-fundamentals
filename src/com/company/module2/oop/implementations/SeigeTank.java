package com.company.module2.oop.implementations;

import com.company.module2.oop.types.TerranMech;
import com.company.module2.oop.types.Armed;
import com.company.module2.oop.types.Drivable;
import com.sun.tools.javac.util.Pair;

public class SeigeTank extends TerranMech implements Armed, Drivable {
    // fields
    private boolean seigeMode;

    // constructor to make a regular seige tank
    public SeigeTank() {
        super(60.0, 30);
        this.seigeMode = false;
        System.out.println("Seige tank ready!");
    }

    // overloaded constructor to make Jim Raynor's personal seige tank
    public SeigeTank(int attackDamage) {
        super(100.0, attackDamage);
        this.seigeMode = false;
        System.out.println("Jim Raynor in da hause!");
    }

    @Override
    public void drive() {
        if(seigeMode){
            System.out.println("Command given to move but cannot, seige mode is on");
        }
        else{
            System.out.println("Seige tank shifted gear to " + shiftGear() + " and now is driving at " + getMaxSpeed() + "kms/hr");
        }
    }

    @Override
    public void attack(String target) {
        if(seigeMode){
            System.out.println("BOOM! " + getAttackDamage() * 3 + " points of heavy splash damage is dealt to " + target + " at " + calculateFiringTrajectory());
        }
        else{
            System.out.println("POP! " + getAttackDamage() + " points of single target damage is dealt to " + target + " at " + calculateFiringTrajectory());
        }
    }

    @Override
    public void callInMedivac(){
        // instructions
    }

    private int shiftGear(){
        // tank driver is deciding which gear is appropriate
        return 5;
    }

    private Pair<Double, Double> calculateFiringTrajectory(){
        // tank driver is calculating the x and y co-ordinates here
        return new Pair<>(6.77, 5.12);
    }

    // setter for activating seige mode
    public void setSeigeMode(boolean seigeMode) {
        this.seigeMode = seigeMode;
        String feedback = seigeMode ? "Seige mode activated!" : "Seige mode deactivated!";
        System.out.println(feedback);
    }
}
