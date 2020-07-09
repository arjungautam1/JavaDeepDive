import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
//        To take the inputs

        System.out.println("Enter the number :");
        Scanner obj=new Scanner(System.in);
        int number =obj.nextInt();
        System.out.println("The entered number is :"+number);
    }

}
