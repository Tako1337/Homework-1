package com.narxoz.rpg.factory.equipment;

import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.magic.*;

public class MagicEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() {
        return new WizardStaff();
    }

    public Armor createArmor() {
        return new EnchantedRobes();
    }
}
