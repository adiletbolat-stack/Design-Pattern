package edu.narxoz.rpg.character;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;

/**
 * Base interface for all character types in the RPG system.
 *
 * TODO: Decide if this should be an interface or abstract class
 * Think: What's common to ALL characters?
 * Think: What varies between character types?
 *
 * Factory Method Pattern:
 * This represents the "Product" in the Factory Method pattern.
 * Different character classes (Warrior, Mage, Archer) are concrete products.
 */
public interface Character {

    String getName();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    int getStealth();

    void displayStats();

    void useSpecialAbility();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);

    void displayEquipment();
}


