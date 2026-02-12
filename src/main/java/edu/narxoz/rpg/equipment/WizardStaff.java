package edu.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private final int baseDamage = 18;
    private final int strengthBonus = 0;
    private final int intelligenceBonus = 10;
    private final int stealthBonus = 0;

    @Override
    public String getName() {
        return "Wizard Staff";
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String getWeaponType() {
        return "Staff";
    }

    @Override
    public String getDescription() {
        return "A mystical staff infused with arcane energy.";
    }

    @Override
    public int getStrengthBonus() {
        return strengthBonus;
    }

    @Override
    public int getStealthBonus() {
        return stealthBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    @Override
    public void attack() {
        System.out.println("Casting a powerful arcane blast!");
    }
}

