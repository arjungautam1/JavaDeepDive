package classandobj;

import classandobj.Class;

public class ObjectDemo {
    public static void main(String[] args) {
        Class obj=new Class();
        obj.id=1;
        obj.address="Kathmandu";
        obj.percentage=50.5;
        obj.printDetail();
    }
}
