package Code;

import Interfaces.IDrink;
import Interfaces.IPee;

import java.util.Objects;

public class Human {

    String name;
    Integer age;
    Integer weight;
    IDrink drinkeable;
    IPee peeable;

    public Human(String name, Integer age, Integer weight, IDrink drinkeable, IPee peeable) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.drinkeable = drinkeable;
        this.peeable = peeable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(age, human.age) &&
                Objects.equals(weight, human.weight) &&
                Objects.equals(drinkeable, human.drinkeable) &&
                Objects.equals(peeable, human.peeable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, drinkeable, peeable);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", drinkeable=" + drinkeable +
                ", peeable=" + peeable +
                '}';
    }
}
