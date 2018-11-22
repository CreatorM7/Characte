package com.me;

public class Main {
    public static void main(String[] args)
    {
        Monster monster = new Monster(50, 8);
        Hero hero = new Hero(60,5);

        System.out.println(BattleStage.startBattle(monster,hero));



    }
}
