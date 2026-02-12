package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.*;

public abstract class Character {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Weapon weapon;
    protected Armor armor;

    public Character(String name) {
        this.name = name;
    }

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public void showStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health +
                " Mana: " + mana +
                " Strength: " + strength +
                " Intelligence: " + intelligence);
    }

    public void showEquipment() {
        if (weapon != null)
            System.out.println("Weapon: " + weapon.getWeaponInfo());

        if (armor != null)
            System.out.println("Armor: " + armor.getArmorInfo());
    }

    public abstract void useSpecialAbility();
}
