package static_var;

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
