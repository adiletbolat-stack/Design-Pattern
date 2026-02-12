package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;
import edu.narxoz.rpg.equipment.IronSword;
import edu.narxoz.rpg.equipment.PlateArmor;


public class MedievalEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
