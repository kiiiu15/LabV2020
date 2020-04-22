package Code;

import Interfaces.IDrink;

public class IDrinkSpartanImp implements IDrink {

    public IDrinkSpartanImp() {
        super();
    }

    @Override
    public void drink(String name) {
        Main.print(name +" el spartano a bebido una cerveza ");
    }
}
