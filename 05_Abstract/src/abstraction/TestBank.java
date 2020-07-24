package abstraction;

abstract class Bank{
    abstract int getRateOfInterest();
}
class NMB extends Bank{
    int getRateOfInterest()
    {
        return 7;
    }
}
class NIC extends Bank{

    int getRateOfInterest() {
        return 8;
    }
}

public class TestBank {
    public static void main(String[] args) {

        Bank bank = new NMB() ;
        Bank bank1=new NIC();

        System.out.println("Rate of Interest is :"+bank.getRateOfInterest());
        System.out.println("Rate of Interest of abstraction.NIC :"+bank1.getRateOfInterest());
    }

}
