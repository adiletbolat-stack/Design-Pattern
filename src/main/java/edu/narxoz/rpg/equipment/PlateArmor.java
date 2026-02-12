package edu.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private final int baseDefense = 40;

    @Override
    public String getName() {
        return "Plate Armor";
    }

    @Override
    public int getBaseDefense() {
        return baseDefense;
    }

    @Override
    public String getArmorType() {
        return "Plate";
    }

    @Override
    public String getDescription() {
        return "Heavy armor offering excellent physical protection.";
    }

    @Override
    public int getHealthBonus() {
        return 20;
    }

    @Override
    public int getStrengthBonus() {
        return 5;
    }

    @Override
    public int getIntelligenceBonus() {
        return 0;
    }

    @Override
    public int getStealthBonus(){
        return 0;
    }
}

