package Code;

import Interfaces.IDrink;
import Interfaces.IPee;

public class Viking extends Human {


    public Viking(String name, Integer age, Integer weight, IDrink drinkeable, IPee peeable) {
        super(name, age, weight, drinkeable, peeable);
    }

    public void drink(){
        super.drinkeable.drink();
    }

    public void pee(){
        super.peeable.pee();
    }

    @Override
    public String toString() {
        return "Viking{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", drinkeable=" + drinkeable +
                ", peeable=" + peeable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ( o != null && o instanceof Viking){
            return super.equals(o);
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
