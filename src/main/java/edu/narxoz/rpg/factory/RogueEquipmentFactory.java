package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.BlackCloak;
import edu.narxoz.rpg.equipment.Daggers;
import edu.narxoz.rpg.equipment.Weapon;


public class RogueEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Daggers();
    }

    @Override
    public Armor createArmor() {
        return new BlackCloak();
    }
}
