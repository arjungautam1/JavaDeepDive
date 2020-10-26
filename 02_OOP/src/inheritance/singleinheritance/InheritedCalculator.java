package inheritance.singleinheritance;/*
 * Created By Arjun Gautam .
 * Date : 10/26/20
 * Time : 9:16 PM
 */

public class InheritedCalculator extends Calculator {
    int mul(int i, int j) {
        return i * j;
    }

    int division(int i, int j) {
        return i / j;
    }

    int modulo(int i, int j) {
        return i % j; //remainder
    }

    public static void main(String[] args) {
        InheritedCalculator inheritedCalculator = new InheritedCalculator();
        System.out.println(inheritedCalculator.add(10, 20));
        System.out.println(inheritedCalculator.sub(20,10));
        System.out.println(inheritedCalculator.mul(2,3));
        System.out.println(inheritedCalculator.division(30, 3));
        System.out.println(inheritedCalculator.modulo(30, 29));

    }
}
