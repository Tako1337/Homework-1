package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;

public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
