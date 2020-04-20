package Code;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");

        Viking v = new Viking("Johnistain", 12, 150 , new IDrinkVikingImp(), new IPeeVikingImp());

        v.drink();
    }
}
