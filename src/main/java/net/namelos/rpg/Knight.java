package net.namelos.rpg;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("knight");
        weapon.useWeapon();
    }
}
