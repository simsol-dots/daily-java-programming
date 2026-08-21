public class InteritDemo {

    static void main() {

        Dog dog = new Dog();
        dog.eat();
        dog.scream();
    }

}

class Animal {

    void eat () {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal {

    void scream () {
        System.out.println("Dog is screaming");
    }

}
