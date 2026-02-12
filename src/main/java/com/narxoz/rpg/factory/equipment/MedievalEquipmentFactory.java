package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.medieval.*;

public class MedievalEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new IronSword();
    }

    public Armor createArmor() {
        return new PlateArmor();
    }
}
