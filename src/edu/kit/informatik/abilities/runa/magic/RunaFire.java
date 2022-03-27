package edu.kit.informatik.abilities.runa.magic;

import edu.kit.informatik.model.AttackType;
import edu.kit.informatik.model.CardType;
import edu.kit.informatik.model.MagicAbility;
import edu.kit.informatik.model.MonsterType;

/**
 * 
 * Offensive Runa Fähigkeitskarte
 * 
 * @author uwhlp
 * @version 1.0.0
 * 
 */

public class RunaFire extends MagicAbility {

    private static final int VALUE_ONE = 5;
    private static final int VALUE_TWO = 0;

    /**
     * Konstruktor
     * 
     * @param level das Level
     */
    public RunaFire(int level) {
        super.setValue(MonsterType.ICE, VALUE_ONE, VALUE_TWO);
        super.init(level, AttackType.MAGIC, CardType.OFFENSIVE, false, "Fire");
    }
}
