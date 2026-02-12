package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;
import edu.narxoz.rpg.equipment.LeatherArmor;
import edu.narxoz.rpg.equipment.LongBow;


public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new LongBow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
