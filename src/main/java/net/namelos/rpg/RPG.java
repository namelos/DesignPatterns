package net.namelos.rpg;

public class RPG {
    public static void main(String[] args) {
        King king = new King();
        king.setWeapon(new BowAndArrowBehaviour());
        king.fight();

        Queen queen = new Queen();
        queen.setWeapon(new KnifeBehaviour());
        queen.fight();

        Knight knight = new Knight();
        knight.setWeapon(new AxeBehaviour());
        knight.fight();

        Troll troll = new Troll();
        try {
            troll.fight();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
