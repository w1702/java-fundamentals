package com.company.module2.oop.implementations;

public class Commander {
    public void command(){
        SeigeTank tank = new SeigeTank();
        tank.drive();
        tank.attack("zergling");
        tank.setSeigeMode(true);
        tank.attack("zergling");
        tank.drive();
        tank.setSeigeMode(false);
        tank.drive();

        System.out.println("------------ Cheat code received, creating special unit ----------------------");

        SeigeTank jimRaynorTank = new SeigeTank(100);
        jimRaynorTank.attack("ultralisk");
        jimRaynorTank.setSeigeMode(true);
        jimRaynorTank.attack("ultralisk");

        jimRaynorTank.callInOrbitalStrike();
    }
}
