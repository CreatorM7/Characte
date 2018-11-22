package com.me;

import java.util.Random;

public class BattleStage {

    private BattleStage(){}

    public static String startBattle(Monster monster, Hero hero)
    {
        while ((monster.getHp() > 0) && (hero.getHp() > 0)){
            Random random = new Random();
            int MonsterRndDmg = random.nextInt(monster.getDamage()+1);
            int HeroRndDmg = random.nextInt(hero.getDamage()+1);
            hero.setHp(hero.getHp() - MonsterRndDmg);
            System.out.println
                    ("Monster attacked hero, he made " + MonsterRndDmg +" damage"+ " hero hp is " +hero.getHp());
            if(hero.getHp() > 0)
            {
                monster.setHp(monster.getHp() - HeroRndDmg);
                System.out.println
                        ("Hero attacked monster, he made " + HeroRndDmg +" damage"+ " monster hp is " + monster.getHp());
            }
            else {break;}
        }

        if(hero.getHp() > 0)
        {
            return "Hero Wins";
        }
        else {
            return "Monster Wins";
        }
    }
}
