package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.character.ArcherFactory;
import com.narxoz.rpg.factory.character.CharacterFactory;
import com.narxoz.rpg.factory.character.MageFactory;
import com.narxoz.rpg.factory.character.WarriorFactory;
import com.narxoz.rpg.factory.equipment.EquipmentFactory;
import com.narxoz.rpg.factory.equipment.MagicEquipmentFactory;
import com.narxoz.rpg.factory.equipment.MedievalEquipmentFactory;
import com.narxoz.rpg.factory.equipment.RangerEquipmentFactory;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Thor");

        EquipmentFactory medieval = new MedievalEquipmentFactory();
        warrior.equip(medieval.createWeapon(), medieval.createArmor());

        System.out.println("--- Creating Warrior ---");
        warrior.showStats();
        System.out.print("Special Ability: ");
        warrior.useSpecialAbility();
        System.out.println("Equipped with Medieval Set:");
        warrior.showEquipment();
        System.out.println();

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Gandalf");

        EquipmentFactory magic = new MagicEquipmentFactory();
        mage.equip(magic.createWeapon(), magic.createArmor());

        System.out.println("--- Creating Mage ---");
        mage.showStats();
        System.out.print("Special Ability: ");
        mage.useSpecialAbility();
        System.out.println("Equipped with Magic Set:");
        mage.showEquipment();
        System.out.println();

        CharacterFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter("Legolas");

        EquipmentFactory ranger = new RangerEquipmentFactory();
        archer.equip(ranger.createWeapon(), ranger.createArmor());

        System.out.println("--- Creating Archer ---");
        archer.showStats();
        System.out.print("Special Ability: ");
        archer.useSpecialAbility();
        System.out.println("Equipped with Ranger Set:");
        archer.showEquipment();
        System.out.println();
    }
}
