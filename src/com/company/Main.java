package com.company;

public class Main {

    public static void main(String[] args) {
            Warrior warrior = new Warrior(250, 10);
            Magic magic = new Magic(220, 15);
            Medic medic = new Medic(210, 5);
            Hero[] heroes = new Hero[]{warrior,magic,medic};
            for (int i = 0 ; i < heroes.length; i++) {
                heroes[i].applySuperAbiliti("Ability");
            }

    }
}
