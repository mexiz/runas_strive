package edu.kit.informatik.abilities.monster.defence;

import edu.kit.informatik.Runa;
import edu.kit.informatik.model.Ability;
import edu.kit.informatik.model.AttackType;
import edu.kit.informatik.model.CardType;
import edu.kit.informatik.model.Monster;

/**
 * 
 * Defensive Monster Fähigkeitskarte
 * 
 * @author uwhlp
 * @version 1.0.0
 * 
 */

public class MonsterBlock extends Ability {

    private static final int ABILITY_VALUE = -7;

    /**
     * Konstruktor
     * 
     * @param level das Level
     */
    public MonsterBlock(int level) {
        super.init(level, AttackType.PHYS, CardType.DEFENSIV, false, "Block");
    }

    @Override
    public int execute(int dice, Runa runa, Monster monster) {
        return ABILITY_VALUE * super.getLevel();
    }

}
