package com.narxoz.rpg.factory.character;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {

    public abstract Character createCharacter(String name);
}
