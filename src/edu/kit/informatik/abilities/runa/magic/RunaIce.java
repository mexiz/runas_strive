package edu.kit.informatik.abilities.runa.magic;

import edu.kit.informatik.Runa;
import edu.kit.informatik.model.AttackType;
import edu.kit.informatik.model.CardType;
import edu.kit.informatik.model.Monster;
import edu.kit.informatik.model.MonsterType;
import edu.kit.informatik.model.Ability;

/**
 * 
 * Offensive Runa Fähigkeitskarte
 * 
 * @author uwhlp
 * @version 1.0.0
 * 
 */

public class RunaIce extends Ability {

    public RunaIce(int level) {
        super.setLevel(level);
        super.setAttackType(AttackType.MAGIC);
        super.setCardType(CardType.OFFENSIVE);
        super.setBreakFocus(false);
        super.setName("Ice");
    }

    @Override
    public int execute(int dice, Runa runa, Monster monster) {
        int damage = (2 * super.getLevel()) + 4;
        damage *= runa.getFocus();
        damage += 2;
        if (monster.getMonsterType().equals(MonsterType.WASSER)) {
            damage += 2 * super.getLevel();
        }
        return damage;
    }

}
