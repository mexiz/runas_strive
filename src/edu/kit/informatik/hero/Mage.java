package edu.kit.informatik.hero;

import java.util.List;

import edu.kit.informatik.abilities.runa.defence.RunaFocus;
import edu.kit.informatik.abilities.runa.magic.RunaWater;
import edu.kit.informatik.model.Ability;

public class Mage extends HeroClass {

    private static final String HERO_CLASS_NAME = "Mage";

    List<Ability> abilities = List.of(new RunaFocus(1),
            new RunaWater(1));

    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public String getHeroName() {
        return HERO_CLASS_NAME;
    }

}
