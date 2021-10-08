package HW6;

public class Cat extends Animals {

    public Cat(String name) {
        this.name = name;
    }

    @Override

    public void run () {
        System.out.println(name + " пробежал 200 метров");
    }

    @Override

    public void swim() {
        System.out.println(name + "  не умеет плавать");
    }
}
