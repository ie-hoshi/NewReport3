package jp.ac.uryukyu.ie.e215728;

public class Warrior extends LivingThing{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(getAttack() * 1.5);
        if (this.isDead() == true){
            
        }else{
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
