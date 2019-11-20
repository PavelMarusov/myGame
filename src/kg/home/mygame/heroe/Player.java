package kg.home.mygame.heroe;

import kg.home.mygame.gen.Drawable;
import kg.home.mygame.gen.GameEntyti;
import kg.home.mygame.gen.MakeDamage;
import kg.home.mygame.gen.SuperAbillyti;

public abstract class Player extends GameEntyti implements MakeDamage, Drawable {
    public Player(int health, int damage, SuperAbillyti superAbillyti) {
        super(health, damage);
    }
}
