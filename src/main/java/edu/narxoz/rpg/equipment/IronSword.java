package edu.narxoz.rpg.equipment;

/**
 * Example concrete weapon implementation - Medieval theme.
 *
 * This is provided as a reference to help you understand the structure.
 * Study this, then create other weapons and armor for different themes.
 *
 * Notice:
 * - This implements the Weapon interface
 * - It has specific attributes for this weapon type
 * - It belongs to the "Medieval" equipment family
 *
 * TODO: Create similar implementations for:
 * Weapons:
 * - WizardStaff (Magic theme)
 * - Longbow (Ranger theme)
 * - Other weapons you imagine...
 *
 * Armor:
 * - PlateArmor (Medieval theme)
 * - EnchantedRobes (Magic theme)
 * - LeatherArmor (Ranger theme)
 * - Other armor you imagine...
 */
public class IronSword implements Weapon {

    private final int baseDamage = 25;
    private final int strengthBonus = 5;
    private final int intelligenceBonus = 0;
    private final int stealthBonus = 0;

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
    public int getStealthBonus() {
        return stealthBonus;
    }

    @Override
    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    @Override
    public void attack() {
        System.out.println("Swinging the Iron Sword with force!");
    }

}

