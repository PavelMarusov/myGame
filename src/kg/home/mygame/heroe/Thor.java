package kg.home.mygame.heroe;

import kg.home.mygame.boss.Boss;
import kg.home.mygame.gen.SuperAbillyti;

import java.util.Random;

public class Thor extends Player {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbillyti.STUN);
    }

    @Override
    public void drawLabel() {
        System.out.println("\uD83D\uDD28");

    }

    @Override
    public void useSuperAbility(Player[] players, Boss boss) {
        if (players[3].getHealth() > 0) {
            Random r = new Random();
            int[] gen = {r.nextInt(5)};
            for (int a : gen) {
                if (a == 2) {
                    for (int i = 0; i < players.length; i++) {
                        players[i].setHealth(players[i].getHealth() - 0);
                        drawLabel();
                        System.out.println("Boss miss");
                        break;
                    }

                }
            }

        }

    }
}
