package inheritance.heirarchical;

class Animal {
    void eat() {
        System.out.println("Eating ");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing ");
    }
}

public class HeirarchicalInheritance {

    public static void main(String[] args) {
        Cat cat=new Cat();
    cat.meow();
//    cat.bark(); // Gives compile time error
        cat.eat();
    }


}
