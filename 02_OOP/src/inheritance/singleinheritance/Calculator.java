package inheritance.singleinheritance;/*
 * Created By Arjun Gautam .
 * Date : 10/26/20
 * Time : 9:10 PM
 */

public class Calculator {
    int add(int i, int j) {
        return i + j;
    }

    int sub(int i, int j) {
        return i - j;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.sub(20, 10));

    }
}

