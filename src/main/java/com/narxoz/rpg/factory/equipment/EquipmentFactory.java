package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.*;

public interface EquipmentFactory {

    Weapon createWeapon();
    Armor createArmor();
}
