package Code;

public class Main {
    public static void main(String[] args) {

        BeerHouse bh = new BeerHouse(100);

        BeerConsumer bc = new BeerConsumer(bh);

        bc.start();

        BeerProducer bp = new BeerProducer(bh);

        bp.start();

    }
}
