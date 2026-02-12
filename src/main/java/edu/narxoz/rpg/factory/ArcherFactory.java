package edu.narxoz.rpg.factory;

import edu.narxoz.rpg.character.Archer;
import edu.narxoz.rpg.character.Character;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }
}
