package com.company;

import com.company.module2.oop.implementations.SeigeTank;

public class Main {

    public static void main(String[] args) {
        /* OOP - Abstraction, Encapsulation, Inheritance, Polymorphism (method overloading), inner classes, oop design */

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

        /* maven, dependencies and jars */

        /* basic mvc pattern, sql, db abstraction */

        /* Builder pattern */

        /* Dependency injection */

        /* unit testing */

        /* git, git flow, repos and ci */

        /* spring */

        /* calling apis */

        /* validation and Exceptions */

        /* File I/O, file separators */

        /* scrum and workflows */

        /* project from scratch */

        /* integration testing/ testing pyramid */

        /* data structures and algorithms, nested loops, reusing objects, recursion */
    }
}
