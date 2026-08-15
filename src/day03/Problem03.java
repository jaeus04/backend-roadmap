package day03;

public class Problem03 {
    public static void printSound(Animal animal){
        animal.sound();
    }
    public static void main(String[] args){
        printSound(new Dog());
        printSound(new Cat());
    }
}
