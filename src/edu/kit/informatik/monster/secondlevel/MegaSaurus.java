package edu.kit.informatik.monster.secondlevel;

import java.util.List;

import edu.kit.informatik.abilities.monster.defence.MonsterBlock;
import edu.kit.informatik.abilities.monster.defence.MonsterFocus;
import edu.kit.informatik.abilities.monster.magic.MonsterFire;
import edu.kit.informatik.abilities.monster.magic.MonsterLightning;
import edu.kit.informatik.abilities.monster.phys.MonsterBite;
import edu.kit.informatik.abilities.monster.phys.MonsterScratch;
import edu.kit.informatik.model.Monster;
import edu.kit.informatik.model.Ability;
import edu.kit.informatik.monster.MonsterType;

public class MegaSaurus implements Monster {

    private static final MonsterType MONSTER_TYPE = MonsterType.NONE;
    private static final String name = "MegaSaurus";
    private int health = 100;
    private int countAbility = 0;
    private int focusPoint = 0;

    private List<Ability> abilities = List.of(new MonsterBite(2),
            new MonsterBlock(2),
            new MonsterFocus(2),
            new MonsterFire(1),
            new MonsterLightning(1));

    private Ability currentAbility = abilities.get(countAbility);
    @Override
    public String getName() {
        return name;
    }
    @Override
    public MonsterType getMonsterType() {
        return MONSTER_TYPE;
    }

    @Override
    public int getFocusPoints() {
        return focusPoint;
    }

    @Override
    public void setFocusPoints(int focusPoint) {
        this.focusPoint = focusPoint;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public Ability getAbility() {
        return currentAbility;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setAbility(Ability abilities) {
        this.currentAbility = abilities;

    }

    @Override
    public void changeAbility() {
        countAbility++;
        if (countAbility > abilities.size() - 1) {
            countAbility = 0;
        }
        currentAbility = abilities.get(countAbility);
    }
}

