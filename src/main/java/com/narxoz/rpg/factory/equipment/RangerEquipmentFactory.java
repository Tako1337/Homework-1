package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.ranger.*;

public class RangerEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new Longbow();
    }

    public Armor createArmor() {
        return new LeatherArmor();
    }
}
