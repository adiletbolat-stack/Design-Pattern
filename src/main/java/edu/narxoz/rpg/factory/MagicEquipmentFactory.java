package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;
import edu.narxoz.rpg.equipment.EnchantedRobes;
import edu.narxoz.rpg.equipment.WizardStaff;


public class MagicEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new EnchantedRobes();
    }
}
