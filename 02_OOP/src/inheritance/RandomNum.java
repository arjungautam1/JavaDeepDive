package inheritance;

import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {

        Random random=new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());

        System.out.println(random.nextLetter());


    }


}
