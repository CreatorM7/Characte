package com.me;

public class Monster {

    private int hp;
    private int damage;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() {
        this.damage = damage;
    }

    public Monster(int hp, int damage) {
        this.damage = damage;
        this.hp = hp;
    }
}
