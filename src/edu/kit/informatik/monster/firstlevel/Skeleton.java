package edu.kit.informatik.monster.firstlevel;

import java.util.List;

import edu.kit.informatik.abilities.monster.defence.MonsterFocus;
import edu.kit.informatik.abilities.monster.magic.MonsterLightning;
import edu.kit.informatik.model.Ability;
import edu.kit.informatik.model.Monster;
import edu.kit.informatik.model.MonsterType;

/**
 * Das Monster
 * 
 * @author uwlhp
 * @version 1.0.0
 */
public class Skeleton extends Monster {

    private static final MonsterType MONSTER_TYPE = MonsterType.LIGHTNING;
    private static final String NAME = "Skeleton";
    private static final int HEALTH = 14;
    private List<Ability> abilities = List.of(new MonsterFocus(1),
            new MonsterLightning(1));

    
    /**
     * no
     */
    public Skeleton() {
        super.init(NAME, HEALTH, abilities, MONSTER_TYPE);
    }
}
