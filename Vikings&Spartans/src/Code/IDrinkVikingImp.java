package Code;

import Interfaces.IDrink;

public class IDrinkVikingImp implements IDrink {

    public IDrinkVikingImp() {
        super();
    }

    @Override
    public void drink(String name) {

        Main.print(name + " , el vikingo a bebido una cerveza ");
    }
}
