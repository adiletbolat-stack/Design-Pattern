package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.character.Rogue;
import edu.narxoz.rpg.character.Character;

public class RogueFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Rogue(name);
    }
}
