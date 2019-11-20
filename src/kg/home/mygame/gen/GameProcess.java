package kg.home.mygame.gen;

import kg.home.mygame.boss.Boss;
import kg.home.mygame.heroe.*;

public class GameProcess {
    public static void startGame() {
        Boss boss = new Boss(400, 5);

        Archer archer = new Archer(200, 2);
        Medic medic = new Medic(200, 3);
        medic.setHealPoint(1);
        Tanck tanck = new Tanck(200, 2);
        tanck.setBlockDamage(boss.getDamage()-2);
        Thor thor = new Thor(100,2);
        Player[] players = {archer, medic, tanck,thor};


        printStatistic(players, boss);
        while (!isFinished(players, boss)) {
            round(players, boss);
        }

    }

    private static void round(Player[] players, Boss boss) {
        System.out.println("_________________");
        printStatistic(players, boss);
        bossHit(players, boss);
        heroesHit(players, boss);
        System.out.println("----------");
        useSuperAbility(players, boss);
        System.out.println("----------");
        System.out.println("_________________");
    }
private static void useSuperAbility(Player[] players, Boss boss){
    for (int i = 0; i <players.length; i++) {
        players[i].useSuperAbility(players, boss);

    }
}
    private static void printStatistic(Player[] players, Boss boss) {
        System.out.println("Boss health : " + boss.getHealth());
        for (int i = 0; i < players.length; i++) {

            System.out.println(players[i].getClass().getSimpleName() + " health : " + players[i].getHealth());
            players[i].drawLabel();

        }
    }

    private static void bossHit(Player[] players, Boss boss) {
        for (int i = 0; i < players.length; i++) {
            players[i].setHealth(players[i].getHealth() - boss.getDamage());

        }

    }

    private static void heroesHit(Player[] players, Boss boss) {
        for (int i = 0; i < players.length; i++) {
            boss.setHealth(boss.getHealth() - players[i].getDamage());

        }

    }

    private static boolean isFinished(Player[] players, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean heroesIsDead = true;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getHealth() > 0) {
                heroesIsDead = false;
                break;
            }
        }
        if (heroesIsDead) {
            System.out.println("Boss won!!!");
        }

        return heroesIsDead;

    }
}

