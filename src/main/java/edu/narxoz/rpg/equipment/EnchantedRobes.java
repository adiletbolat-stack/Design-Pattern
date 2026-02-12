package edu.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private final int baseDefense = 15;

    @Override
    public String getName() {
        return "Enchanted Robes";
    }

    @Override
    public int getBaseDefense() {
        return baseDefense;
    }

    @Override
    public String getArmorType() {
        return "Robe";
    }

    @Override
    public String getDescription() {
        return "Robes infused with magical protection.";
    }

    @Override
    public int getHealthBonus() {
        return 5;
    }

    @Override
    public int getStrengthBonus() {
        return 0;
    }

    @Override
    public int getIntelligenceBonus() {
        return 12;
    }

    @Override
    public int getStealthBonus(){
        return 0;
    }
}
