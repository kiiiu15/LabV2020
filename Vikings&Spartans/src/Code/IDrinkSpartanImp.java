package Code;

import Interfaces.IDrink;

public class IDrinkSpartanImp implements IDrink {

    public IDrinkSpartanImp() {
        super();
    }

    @Override
    public void drink() {
        System.out.println(" spartano a bebido una cerveza ");
    }
}
