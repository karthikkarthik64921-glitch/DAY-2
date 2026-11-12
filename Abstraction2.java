abstract class Animal {
    abstract void sound();

    abstract void behavior();

    void color() {
        System.out.println("Animal color is White");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void behavior() {
        System.out.println("Dog is a loyal animal");
    }

    void color() {
        System.out.println("Dog color is Black");
    }
}

class Main {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
        obj.behavior();
        obj.color();
    }
}