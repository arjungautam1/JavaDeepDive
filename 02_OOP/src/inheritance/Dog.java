package inheritance;/*
 * Created By Arjun Gautam .
 * Date : 10/21/20
 * Time : 9:49 PM
 */

//Parent class
 class Dog {
    void eat() {
        System.out.println("Eating ...");
    }

}
//child class
class Puppy extends Dog {

    void weep() {
        System.out.println("Weeping ...");
    }

}

class Main {
    public static void main(String[] args) {
        Puppy puppy=new Puppy();
        puppy.eat();
        puppy.weep();

    }

}
