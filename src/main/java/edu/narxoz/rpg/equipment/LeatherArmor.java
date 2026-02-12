package edu.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private final int baseDefense = 25;

    @Override
    public String getName() {
        return "Leather Armor";
    }

    @Override
    public int getBaseDefense() {
        return baseDefense;
    }

    @Override
    public String getArmorType() {
        return "Leather";
    }

    @Override
    public String getDescription() {
        return "Light armor allowing agility and stealth.";
    }

    @Override
    public int getHealthBonus() {
        return 10;
    }

    @Override
    public int getStrengthBonus() {
        return 2;
    }

    @Override
    public int getIntelligenceBonus() {
        return 0;
    }

    @Override
    public int getStealthBonus(){
        return 5;
    }
}

