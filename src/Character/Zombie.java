package Character;

import Character.Common.Common;
import Character.Interface.CommonInterface;

/**
* Zombie; düşman karakterdir.
*/

public class Zombie extends Common implements CommonInterface {

    public Zombie(int health) {
        super("Zombie", health);
    }


    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getLocation() {
        return super.getLocation();
    }

    @Override
    public int attackPoint() {
        return 7;
    }
}
