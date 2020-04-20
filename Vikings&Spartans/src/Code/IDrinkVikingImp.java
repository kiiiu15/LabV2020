package Code;

import Interfaces.IDrink;

public class IDrinkVikingImp implements IDrink {

    public IDrinkVikingImp() {
        super();
    }

    @Override
    public void drink() {
        System.out.println(" vikingo a bebido una cerveza ");
    }
}
