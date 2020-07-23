package inheritance;

/*Inheritance in Java is a mechanism in which one object acquires
 all the properties and behaviors of a parent object.
* */
class Animal
{
    void eat()
    {
        System.out.println("Eating ....");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Barking ...");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
    }
}
