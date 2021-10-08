package HW6;

public class Main {

    public static void main(String[] args) {
        Animals animals = new Cat("Барсик");
        animals.swim();
        animals.run();

        Animals animals1 = new Dog("Толик");
        animals1.swim();
        animals1.run();
    }
}
