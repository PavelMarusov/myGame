package kg.home.mygame.boss;

import kg.home.mygame.gen.GameEntyti;
import kg.home.mygame.gen.Drawable;

public class Boss extends GameEntyti implements Drawable {

    public Boss(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void drawLabel() {
        System.out.println("\uD83D\uDC51");
    }
}
