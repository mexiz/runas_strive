package edu.kit.informatik.abilities.monster.magic;

import edu.kit.informatik.Runa;
import edu.kit.informatik.model.AttackType;
import edu.kit.informatik.model.CardType;
import edu.kit.informatik.model.Ability;
import edu.kit.informatik.model.Monster;

public class MonsterLightning extends Ability {

    public MonsterLightning(int level) {
        super.setLevel(level);
        super.setAttackType(AttackType.MAGIC);
        super.setCardType(CardType.OFFENSIVE);
        super.setBreakFocus(false);
        super.setName("Lightning");
    }

    @Override
    public int execute(int dice, Runa runa, Monster monster) {
        if (monster.getFocusPoints() > super.getLevel() - 1) {
            int damage = 14 * super.getLevel();
            damage += 2;
            monster.setFocusPoints(monster.getFocusPoints() - super.getLevel());
            return damage;
        }
        return 0;
    }
}