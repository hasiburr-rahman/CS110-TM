package Interface;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog do2 = new Dog();

        do2.Sound2();

        dog.sound();
        dog.eat();
        cat.sound();
        cat.eat();
    }
}
