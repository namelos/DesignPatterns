package net.namelos.rpg;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("queen");
        weapon.useWeapon();
    }
}
