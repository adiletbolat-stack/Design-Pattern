package edu.narxoz.rpg.equipment;

public class BlackCloak implements Armor {

    private final int baseDefense = 20;

    @Override
    public String getName() {
        return "Black Cloak";
    }

    @Override
    public int getBaseDefense() {
        return baseDefense;
    }

    @Override
    public String getArmorType() {
        return "Cloak";
    }

    @Override
    public String getDescription() {
        return "Dark colored cloak, almost invisible in the shadow.";
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
        return 0;
    }

    @Override
    public int getStealthBonus(){
        return 25;
    }
}
