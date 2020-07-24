package multiple_inheritance_interface;

/*multiple inheritance is not supported in the case of class because of ambiguity.
However, it is supported in case of an interface because there is no ambiguity.
It is because its implementation is provided by the implementation class
* */
interface Printable{
    void print();
}
interface Showable{
    void show();
}


public class MultipleInheritance implements Printable,Showable {

//    Implementation before main method

    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        MultipleInheritance multipleInheritance=new MultipleInheritance();
        multipleInheritance.print();
        multipleInheritance.show();
    }
}
