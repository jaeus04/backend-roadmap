package day03;
import java.util.List;
import java.util.ArrayList;

public class Problem04 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
