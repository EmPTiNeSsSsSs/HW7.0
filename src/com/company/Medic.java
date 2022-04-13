package com.company;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage);
    }

    public void applySuperAbiliti(String superAbilityType){
        System.out.println("Medic применил способность лечить на 100%");
    }
}
