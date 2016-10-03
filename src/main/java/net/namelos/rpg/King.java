package net.namelos.rpg;

public class King extends Character {
    @Override
    public void fight() {
        System.out.println("king");
        weapon.useWeapon();
    }
}
