package Interface;

interface Printable {
    void print();

}

class ChildClass implements Printable {
    public void print() {
        System.out.println("This is the implementation of abstract method print in Printable class .");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.print();

    }
}
