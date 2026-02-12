package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.character.Warrior;
import edu.narxoz.rpg.character.Character;


public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Warrior(name);
    }
}


