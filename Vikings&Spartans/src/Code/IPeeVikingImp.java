package Code;

import Interfaces.IPee;

public class IPeeVikingImp implements IPee {

    public IPeeVikingImp() {
        super();
    }

    @Override
    public void pee(String name) {
        Main.print(name + ", el vikingo se fue a orinar y ha quedado descalificado");
    }
}
