package Character;

import Character.Common.Common;
import Character.Interface.CommonInterface;

/**
* Mutant; düşman karakterdir.
*/

public class Mutant extends Common implements CommonInterface {

    public Mutant(int health) {
        super("Mutant", health);
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
        return 8;
    }
}
