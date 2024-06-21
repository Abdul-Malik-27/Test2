

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.name = null;

        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();

    }
}