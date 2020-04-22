package Code;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {

    public static Semaphore mutexConsole;

    public synchronized static void print(Object o){

        try {
            Main.mutexConsole.acquire();
            System.out.println(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            Main.mutexConsole.release();
        }



    }

    public static void main(String[] args) {

        Main.mutexConsole = new Semaphore(1);
        System.out.println("Hola");

       ArrayList<Human> vikings = new ArrayList<>();
       vikings.add( new Viking("Juliansen", 30, 90, new IDrinkVikingImp(), new IPeeVikingImp()));
       vikings.add( new Viking("Bork", 90, 70, new IDrinkVikingImp(), new IPeeVikingImp()));
       vikings.add( new Viking("Rank", 50, 20, new IDrinkVikingImp(), new IPeeVikingImp()));


       ArrayList<Human> spartans = new ArrayList<>();
       spartans.add( new Spartan("Juancho", 47, 98, new IDrinkSpartanImp(), new IPeeSpartanImp()));
       spartans.add( new Spartan("Helison", 36, 100, new IDrinkSpartanImp(), new IPeeSpartanImp()));
       spartans.add( new Spartan("Gronch", 24, 110, new IDrinkSpartanImp(), new IPeeSpartanImp()));




    }
}
