package edu.narxoz.rpg.equipment;

/**
 * Interface for all weapon types in the game.
 *
 * Abstract Factory Pattern:
 * This is one of the "Product" interfaces in an Abstract Factory.
 * Each equipment theme (Medieval, Magic, Ranger) will have its own concrete weapon.
 *
 * TODO: Define what all weapons have in common
 * Think: What information should every weapon provide?
 * Examples: damage, weapon type, special properties, etc.
 */
public interface Weapon {

    String getName();

    int getBaseDamage();

    String getWeaponType();

    void attack();

    String getDescription();

    int getStrengthBonus();
    int getIntelligenceBonus();
    int getStealthBonus();
}

