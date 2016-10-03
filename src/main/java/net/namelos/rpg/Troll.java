package net.namelos.rpg;

public class Troll extends Character {

    @Override
    public void fight() {
        System.out.println("troll");
        weapon.useWeapon();
    }
}
