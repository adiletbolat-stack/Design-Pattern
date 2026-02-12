package edu.narxoz.rpg.equipment;

public class LongBow implements Weapon {

    private final int baseDamage = 22;
    private final int strengthBonus = 3;
    private final int intelligenceBonus = 0;
    private final int stealthBonus = 5;

    @Override
    public String getName() {
        return "Longbow";
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String getWeaponType() {
        return "Bow";
    }

    @Override
    public String getDescription() {
        return "A finely crafted bow designed for precision and range.";
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
        System.out.println("Releasing a precise arrow shot!");
    }
}

