package edu.kit.informatik.hero;

import java.util.ArrayList;
import java.util.List;

import edu.kit.informatik.abilities.runa.defence.RunaReflect;
import edu.kit.informatik.abilities.runa.phys.RunaSlash;
import edu.kit.informatik.model.Ability;

public class Paladin extends HeroClass {

    private static final String HERO_CLASS_NAME = "Paladin";

    private List<Ability> abilities = new ArrayList<>(List.of(new RunaSlash(1),
            new RunaReflect(1)));

    
    /** 
     * @return List<Ability>
     */
    @Override
    public List<Ability> getAbilities() {
        return abilities;
    }

    
    /** 
     * @return String
     */
    @Override
    public String getHeroName() {
        return HERO_CLASS_NAME;
    }

}
