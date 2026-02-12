package edu.narxoz.rpg.character;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;

public class Rogue implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private int stealth;

    private Weapon weapon;
    private Armor armor;

    public Rogue(String name) {
        this.name = name;
        this.health = 90;
        this.mana = 60;
        this.strength = 70;
        this.intelligence = 50;
        this.stealth = 90;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health + (armor != null ? armor.getHealthBonus() : 0);
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength
                + (weapon != null ? weapon.getStrengthBonus() : 0)
                + (armor != null ? armor.getStrengthBonus() : 0);
    }

    @Override
    public int getIntelligence() {
        return intelligence
                + (weapon != null ? weapon.getIntelligenceBonus() : 0)
                + (armor != null ? armor.getIntelligenceBonus() : 0);
    }

    public int getStealth(){
        return stealth
                + (weapon != null ? weapon.getStealthBonus() : 0)
                + (armor != null ? armor.getStealthBonus() : 0);
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped weapon: " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " equipped armor: " + armor.getName());
    }

    @Override
    public void displayEquipment() {
        System.out.println("Weapon: " + (weapon != null ? weapon.getName() : "None"));
        System.out.println("Armor: " + (armor != null ? armor.getName() + ", " + armor.getDescription() : "None"));
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Rogue) ===");
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Strength: " + getStrength());
        System.out.println("Intelligence: " + getIntelligence());
        System.out.println("Stealth: " + getStealth());
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses CRIMSON STAB!");
    }
}

