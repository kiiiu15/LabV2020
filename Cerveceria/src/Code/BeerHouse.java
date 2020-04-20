package Code;

/**
 * This class is meant to work as a shared buffer between BeerProducer and BeerConsumer.
 *
 * The house capacity it's gonna ondicate to the producer thread how much beer it can produce.
 */
public class BeerHouse {


    Beer beer ;
    boolean served ;
    Integer houseCapacity ;


    public BeerHouse() {
        this.houseCapacity = 100;
        this.served = false;
        this.beer = null;
    }

    public BeerHouse(Integer houseCapacity) {
        this.houseCapacity = houseCapacity;
        this.served = false;
        this.beer = null;
    }


    public Integer getHouseCapacity() {

        return houseCapacity;

    }

    /**
     * this method retieves the beer and control that the consumer thread does not consume until a beer is served.
     * @return Beer served
     */


    public synchronized Beer getBeer() {

        while (!served){
            try {

                wait();

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

        }

        Beer beerToReturn = this.beer;

        this.served = false;

        notifyAll();

        return beerToReturn;
    }


    /**
     * This method  sets the beer in the beerhouse. It controls the producer thread does not produce until the previous beer hasn't been consumed.
     * @param beer new beer to add.
     */
    public synchronized void  setBeer(Beer beer) {

        while(served){

            try {

                wait();

            } catch (InterruptedException e){

                e.printStackTrace();

            }

        }

        this.beer = beer;

        this.served = true;

        notifyAll();
    }




}
