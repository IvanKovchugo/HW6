package HW6;

public class Main {

    public static void main(String[] args) {
        Animals[] animals = new Cat[3];
        animals [0] = new Cat("Барсик");
        animals [1] = new Cat("Аполлон");
        animals [2] = new Cat("Аид");
        animals[0].swim(0);
        animals[0].run(130);
        animals[1].swim(0);
        animals[1].run(125);
        animals[2].run(200);
        animals[2].swim(0);

        Animals[] dog = new Dog[2];
        dog[0] = new Dog("Арагорн");
        dog[1] = new Dog("Бобик");
        dog[0].swim(5);
        dog[0].run(150);
        dog[1].run(500);
        dog[1].swim(10);

        for (int i = 0; i < animals.length; i++) {

            for (int j = 0; j < dog.length; j++) {

            }
        }

        int a = dog.length + animals.length;
        System.out.print("Всего животных - " + a);
    }
}
