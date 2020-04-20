package Code;

/**
 * This class work as a producer thread , that in this case will produce beer for the beer house.
 * On its contructor it recieves a beerhouse that will be the shared resource with the consumer thread.
 */

public class BeerProducer extends Thread {

    BeerHouse beerHouse;

    public BeerProducer(BeerHouse beerHouse) {
        super();
        this.beerHouse = beerHouse;
    }

    @Override
    public void run() {

        Beer newBeer = null;

        for (int i = 0; i < this.beerHouse.getHouseCapacity() ; i++) {

            System.out.println("The producer creates a beer");

            newBeer = new Beer();

            System.out.println("The producer add the new beer");

            this.beerHouse.setBeer(newBeer);

            System.out.println("The beer has been produced and the productor leaves");



        }

    }
}
