package Code;

/**
 * This class is meant to work as a shared buffer between BeerProducer and BeerConsumer
 */
public class BeerHouse {

    Beer beer = null;
    boolean served = false;

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

        while(!served){

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
