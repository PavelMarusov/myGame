package kg.home.mygame.heroe;

import kg.home.mygame.boss.Boss;
import kg.home.mygame.gen.SuperAbillyti;

public class Medic extends Player {
    private int healPoint;
    public Medic(int health, int damage) {
        super(health, damage, SuperAbillyti.HEAL);
    }
    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }



    @Override
    public void drawLabel() {
        System.out.println("\uD83D\uDC8A");

    }


    @Override
    public void useSuperAbility(Player[] players, Boss boss) {
        for (int i = 0; i <players.length; i++) {
            players[i].setHealth(players[i].getHealth() + healPoint);
            drawLabel();
            System.out.println(players[i].getClass().getSimpleName() + " heal : "+ " + " +healPoint);

        }

    }
}
