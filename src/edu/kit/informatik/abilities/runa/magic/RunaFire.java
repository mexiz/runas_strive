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

public class RunaFire extends Ability {

    public RunaFire(int level) {
        super.init(level, AttackType.MAGIC, CardType.OFFENSIVE, false, "Fire");
    }

    @Override
    public int execute(int dice, Runa runa, Monster monster) {
        int damage = (2 * super.getLevel()) + 5;
        damage *= runa.getFocus();
        if (monster.getMonsterType().equals(MonsterType.ICE)) {
            damage += 2 * super.getLevel();
        }
        return damage;
    }

}
