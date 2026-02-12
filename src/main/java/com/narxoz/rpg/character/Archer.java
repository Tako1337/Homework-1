package com.narxoz.rpg.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name);
        health = 100;
        mana = 80;
        strength = 60;
        intelligence = 60;
    }

    public void useSpecialAbility() {
        System.out.println("Precision Shot!");
    }
}
