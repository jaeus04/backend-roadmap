package day03;

public class Problem02 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
