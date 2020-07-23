package static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student s1=new Student(111,"Ram ");
        Student s2=new Student(112,"Pooja");

        Student.change();

        s1.display();
        s2.display();
    }

}
