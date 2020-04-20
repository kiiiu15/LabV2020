package Code;

import Interfaces.IPee;

public class IPeeVikingImp implements IPee {

    public IPeeVikingImp() {
        super();
    }

    @Override
    public void pee() {
        System.out.println(" vikingo se fue a orinar ");
    }
}
