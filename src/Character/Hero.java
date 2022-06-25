package Character;

import Character.Common.Common;
import Character.Interface.CommonInterface;

/**
* Hero; ana karakterimizdir.
*/

public class Hero extends Common implements CommonInterface {

    private int health;

    public Hero(String enemyName, int health) {
        super("Hero", health);
        this.health = health;
    }


    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Common enemy) {
        enemy.health(10);
    }


    @Override
    public int attackPoint() {
        return 10;
    }
}
