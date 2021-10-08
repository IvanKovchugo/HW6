package HW6;

public class Dog extends Animals{

    public Dog(String name) {
        this.name = name;
    }

    @Override

    public void run () {
        System.out.println(name + " пробежал 500 метров");
    }

    @Override

    public void swim() {
        System.out.println(name + "  проплыл 10 метров");
    }
}
