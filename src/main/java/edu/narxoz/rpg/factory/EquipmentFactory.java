package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;

public interface EquipmentFactory {

    Weapon createWeapon();

    Armor createArmor();
}
