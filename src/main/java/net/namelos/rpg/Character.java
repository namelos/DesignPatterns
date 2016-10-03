package net.namelos.rpg;

public abstract class Character {
    WeaponBehaviour weapon;

    public Character() {
    }

    public abstract void fight();

    public void setWeapon(WeaponBehaviour w) {
        this.weapon = w;
    }
}
