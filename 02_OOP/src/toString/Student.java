package toString;

public class Student {
    int rollNo;
    String name;
    String city;

    public Student(int rollNo, String name, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.city = city;
    }

 @Override
 public String toString()
 {
     return rollNo+" "+name+" "+city;
 }

    public static void main(String[] args) {
        Student s1=new Student(101,"Arjun","Kathmandu");
        Student s2=new Student(102,"Pooja","Butwal");
        System.out.println(s1);
        System.out.println(s2);
    }
}
