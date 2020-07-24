package mixed_abstract;
abstract class Bike{
    Bike()
    {
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("Gear Changed");
    }
}
class Gixxer extends Bike{
    void run()
    {
        System.out.println("running safely");
    }
}
public class MixedAbstract {

    public static void main(String[] args) {
        Bike obj=new Gixxer();
        obj.run();
        obj.changeGear();
    }
}
