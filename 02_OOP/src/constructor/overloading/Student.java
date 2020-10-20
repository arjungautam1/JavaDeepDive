package constructor.overloading;/*
 * Created By Arjun Gautam .
 * Date : 10/20/20
 * Time : 9:48 PM
 */

public class Student {
    int id;
    String name;
    String address;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println("My id : " + id + "My name :" + name+ "Address "+ address);
    }

    public static void main(String[] args) {
    Student student=new Student(1,"Pooja");
    student.display();
    Student student1=new Student(1,"Arjun", "Lokanthali");
    student1.display();
    }

}
