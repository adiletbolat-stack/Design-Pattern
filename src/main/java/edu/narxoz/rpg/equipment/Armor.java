package edu.narxoz.rpg.equipment;

/**
 * Interface for all armor types in the game.
 *
 * Abstract Factory Pattern:
 * This is one of the "Product" interfaces in an Abstract Factory.
 * Each equipment theme (Medieval, Magic, Ranger) will have its own concrete armor.
 *
 * TODO: Define what all armor has in common
 * Think: What information should every armor provide?
 * Examples: defense, armor type, special properties, etc.
 */


public interface Armor {

    String getName();

    int getBaseDefense();

    String getArmorType();

    String getDescription();

    int getHealthBonus();

    int getStrengthBonus();

    int getIntelligenceBonus();

    int getStealthBonus();

}
