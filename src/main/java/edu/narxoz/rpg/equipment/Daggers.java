package edu.narxoz.rpg.equipment;

public class Daggers implements Weapon {

    private final int baseDamage = 10;
    private final int strengthBonus = 5;
    private final int intelligenceBonus = 0;
    private final int stealthBonus = 25;


    @Override
    public String getName() {
        return "Iron Sword";
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    @Override
    public String getWeaponType() {
        return "Sword";
    }

    @Override
    public String getDescription() {
        return "A sturdy medieval blade forged from iron.";
    }

    @Override
    public int getStrengthBonus() {
        return strengthBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    @Override
    public int getStealthBonus() {
        return stealthBonus;
    }

    @Override
    public void attack() {
        System.out.println("Swinging the Iron Sword with force!");
    }

}
