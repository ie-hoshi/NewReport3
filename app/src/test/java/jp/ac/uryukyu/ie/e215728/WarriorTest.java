package jp.ac.uryukyu.ie.e215728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroAttack = 100;
        int defaultEnemyHp = 500;
        Warrior demoWarrior = new Warrior("デモウォーリア", 10, defaultHeroAttack);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 100);
        demoWarrior.attackWithWeponSkill(slime);
        demoWarrior.attackWithWeponSkill(slime);
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 50);
    }
}
