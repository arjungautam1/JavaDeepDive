package constructor;/*
 * Created By Arjun Gautam .
 * Date : 10/20/20
 * Time : 9:35 PM
 */

//Constructor : no return type , name is same as class name
//Id : 5431  My name : Pooja
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("My id : "+id+"My name :"+name);
    }

    public static void main(String[] args) {
        Student obj=new Student(1,"Pooja");
        obj.display();
    }

}
