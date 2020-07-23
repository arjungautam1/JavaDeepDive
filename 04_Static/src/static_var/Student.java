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
