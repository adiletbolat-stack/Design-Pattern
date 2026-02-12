package edu.narxoz.rpg;

import edu.narxoz.rpg.character.Character;
import edu.narxoz.rpg.factory.ArcherFactory;
import edu.narxoz.rpg.factory.CharacterFactory;
import edu.narxoz.rpg.factory.MageFactory;
import edu.narxoz.rpg.factory.WarriorFactory;
import edu.narxoz.rpg.equipment.Armor;
import edu.narxoz.rpg.equipment.Weapon;
import edu.narxoz.rpg.factory.EquipmentFactory;
import edu.narxoz.rpg.factory.MagicEquipmentFactory;
import edu.narxoz.rpg.factory.MedievalEquipmentFactory;
import edu.narxoz.rpg.factory.RangerEquipmentFactory;
import edu.narxoz.rpg.factory.RogueEquipmentFactory;
import edu.narxoz.rpg.factory.RogueFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        Character warrior = createCharacter(new WarriorFactory(), "Gerald");
        Character mage = createCharacter(new MageFactory(), "Merlin");
        Character archer = createCharacter(new ArcherFactory(), "Vesper");
        Character rogue = createCharacter(new RogueFactory(), "Mirage");

        System.out.println();

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory    = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory   = new RangerEquipmentFactory();
        EquipmentFactory rogueFactory   = new RogueEquipmentFactory();

        equipCharacterWithTheme(warrior, medievalFactory);
        equipCharacterWithTheme(mage, magicFactory);
        equipCharacterWithTheme(archer, rangerFactory);
        equipCharacterWithTheme(rogue, rogueFactory);

        System.out.println();


        displayCharacterInfo(warrior);
        System.out.println();
        displayCharacterInfo(mage);
        System.out.println();
        displayCharacterInfo(archer);
        System.out.println();
        displayCharacterInfo(rogue);



        System.out.println("\n=== Demo Complete ===");
    }

    private static Character createCharacter(CharacterFactory factory, String name) {
        Character character = factory.createCharacter(name);
        System.out.println("Created character: " + character.getName());
        return character;
    }

    private static void equipCharacterWithTheme(Character character, EquipmentFactory equipmentFactory) {
        Weapon weapon = equipmentFactory.createWeapon();
        Armor armor = equipmentFactory.createArmor();

        character.equipWeapon(weapon);
        character.equipArmor(armor);
    }

    private static void displayCharacterInfo(Character character) {
        character.displayStats();
        character.displayEquipment();
        character.useSpecialAbility();
    }
}
