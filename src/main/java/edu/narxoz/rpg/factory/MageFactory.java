package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.character.Character;
import edu.narxoz.rpg.character.Mage;

public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Mage(name);
    }
}
