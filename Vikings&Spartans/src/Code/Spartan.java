package Code;

import Interfaces.IDrink;
import Interfaces.IPee;

public class Spartan extends Human {


    public Spartan(String name, Integer age, Integer weight,  IDrinkSpartanImp drinkeable, IPeeSpartanImp peeable) {
        super(name, age, weight, drinkeable, peeable);
    }



    public void drink(){
        System.out.print(super.name + " el ");
        super.drinkeable.drink();
    }

    public void pee(){
        System.out.print(super.name + " el ");
        super.peeable.pee();
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", drinkeable=" + drinkeable +
                ", peeable=" + peeable +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Spartan)
            return super.equals(o);
        else
            return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
