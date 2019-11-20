package kg.home.mygame.heroe;

import kg.home.mygame.boss.Boss;
import kg.home.mygame.gen.SuperAbillyti;

public class Tanck extends Player {
    private int blockDamage;

    public Tanck(int health, int damage) {
        super(health, damage, SuperAbillyti.TAKE_DAMAGE);
    }

    public int getBlockDamage() {
        return blockDamage;
    }

    public void setBlockDamage(int blockDamage) {
        this.blockDamage = blockDamage;
    }

    @Override
    public void drawLabel() {
        System.out.println("⚠");

    }


    @Override
    public void useSuperAbility(Player[] players, Boss boss) {
        if (players[2].getHealth() > 0) {
            for (int i = 0; i < players.length; i++) {
                if (i == 2) {
                    continue;
                }
                players[i].setHealth(players[i].getHealth() - blockDamage);
                drawLabel();
                System.out.println(players[i].getClass().getSimpleName() + " block damage ");




            }
            players[2].setHealth(players[2].getHealth() - (boss.getDamage() + blockDamage));
            drawLabel();
            System.out.println(players[2].getClass().getSimpleName() + " damage forgiven");
        }

    }
}
