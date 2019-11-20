package kg.home.mygame.heroe;

import kg.home.mygame.boss.Boss;
import kg.home.mygame.gen.SuperAbillyti;

import java.util.Random;
import java.util.RandomAccess;

public class Archer extends Player {
    public Archer(int health, int damage) {
        super(health, damage, SuperAbillyti.HEAD_SHOT);
    }

    @Override
    public void drawLabel() {
        System.out.println("\uD83D\uDD2B");

    }


    @Override
    public void useSuperAbility(Player[] players, Boss boss) {
        Random r = new Random();
        int [] generateNumber = {r.nextInt(5)};

        for (int n:generateNumber) {
            if (n==3){
                players[0].setDamage(players[0].getDamage() + 100);
                drawLabel();
                System.out.println("Archer did head shot");
            }
            break;

        }
    }
}
