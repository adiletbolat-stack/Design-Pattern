package edu.narxoz.rpg.character;

import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private int stealth;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;

        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
        this.stealth = 0;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        int bonus = (armor != null) ? armor.getHealthBonus() : 0;
        return health + bonus;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        int weaponBonus = (weapon != null) ? weapon.getStrengthBonus() : 0;
        int armorBonus = (armor != null) ? armor.getStrengthBonus() : 0;
        return strength + weaponBonus + armorBonus;
    }

    @Override
    public int getIntelligence() {
        int weaponBonus = (weapon != null) ? weapon.getIntelligenceBonus() : 0;
        int armorBonus = (armor != null) ? armor.getIntelligenceBonus() : 0;
        return intelligence + weaponBonus + armorBonus;
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
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + getHealth());
        System.out.println("Mana: " + getMana());
        System.out.println("Strength: " + getStrength());
        System.out.println("Intelligence: " + getIntelligence());
    }


    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE!");
        System.out.println("Strength temporarily increased!");
    }
}
