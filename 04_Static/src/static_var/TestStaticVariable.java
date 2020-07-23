package static_var;

class Student{
    private int rollNo; //instance variable
    private String name;
    private static String college;

//    Contructor

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

//    Method to display the values

    void display()
    {
        System.out.println(rollNo+" "+name+" "+college);
    }

//    to hide data using private

    public static void setCollege(String college) {
        Student.college = college;
    }
}

public class TestStaticVariable {
    public static void main(String[] args) {
        Student s1=new Student(111,"Ram ");
        Student s2=new Student(112,"Pooja");
//        Using private we use this
        Student.setCollege("Texas International College ");


//        If we use public college :

//        Student.college="Texas International College ";

        s1.display();
        s2.display();
    }

}
