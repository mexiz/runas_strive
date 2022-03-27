package edu.kit.informatik.abilities.runa.defence;

import edu.kit.informatik.Runa;
import edu.kit.informatik.model.AttackType;
import edu.kit.informatik.model.CardType;
import edu.kit.informatik.model.Monster;
import edu.kit.informatik.model.Ability;

/**
 * 
 * Runa Fähigkeitskarte
 * 
 * @author uwhlp
 * @version 1.0.0
 * 
 */

public class RunaFocus extends Ability {
    
    /**
     * Konstruktor
     * 
     * @param level das Level
     */
    public RunaFocus(int level) {
        super.init(level, AttackType.NONE, CardType.FOCUS, false, "Focus");
    }

    @Override
    public int execute(int dice, Runa runa, Monster monster) {
        return super.getLevel();
    }
}
