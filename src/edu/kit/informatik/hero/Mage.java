package edu.kit.informatik.hero;

import java.util.ArrayList;
import java.util.List;

import edu.kit.informatik.abilities.runa.defence.RunaFocus;
import edu.kit.informatik.abilities.runa.magic.RunaWater;
import edu.kit.informatik.model.Ability;

public class Mage extends HeroClass {

    private static final String HERO_CLASS_NAME = "Mage";

    /** 
     * @return List<Ability>
     */
    @Override
    public List<Ability> getAbilities(int level) {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new RunaFocus(level));
        abilities.add(new RunaWater(level));
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
