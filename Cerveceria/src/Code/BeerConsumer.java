package Code;

/**
 * This class work as a consumer thread that in this clase will consume beer from the beer house.
 *  On it's contructor it recieves a beer house that will work as shared resource with the producer thread.
 */
public class BeerConsumer extends Thread {

    BeerHouse beerHouse;


    public BeerConsumer(BeerHouse beerHouse) {
        super();
        this.beerHouse = beerHouse;
    }


    @Override
    public void run() {

        while(true){

            System.out.println("A consumer enters BeerHouse and ask for Beer");

            Beer myBeer = this.beerHouse.getBeer();

            myBeer.drink();

            System.out.println("The beer has been drinked and the consumer leaves");

        }

    }
}
