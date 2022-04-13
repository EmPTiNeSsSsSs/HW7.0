package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage);
    }

    public void applySuperAbiliti(String superAbilityType){
        System.out.println("Warrior применил способность стихию воздуха");
    }
}
