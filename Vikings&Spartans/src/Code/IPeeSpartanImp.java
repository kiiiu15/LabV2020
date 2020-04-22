package Code;

import Interfaces.IPee;

public class IPeeSpartanImp implements IPee {


    @Override
    public void pee(String name) {

        Main.print(name +", el spartanose fue a orinar y quedo descalificado");
    }
}
