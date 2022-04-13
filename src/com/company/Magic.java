package com.company;

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage);
    }

    public void applySuperAbiliti(String superAbilityType) {
        System.out.println("Magic применил способность летать ");
    }
}
