package HW6;

public class Dog extends Animals{

    public Dog(String name, int range, int swimranged) {
        this.name = name;
        this.range = range;
        this.swimranged = swimranged;
    }

    @Override

    public void run (int range) {
        System.out.println(name + " пробежал " + range + " метров");
    }

    @Override

    public void swim(int swimrange) {
        System.out.println(name + " проплыл " + swimrange + " метров");
    }
}
