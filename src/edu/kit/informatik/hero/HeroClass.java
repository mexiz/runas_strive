package edu.kit.informatik.hero;

import java.util.List;

import edu.kit.informatik.model.Ability;

public abstract class HeroClass {

    public abstract List<Ability> getAbilities();

    public abstract String getHeroName();
}
