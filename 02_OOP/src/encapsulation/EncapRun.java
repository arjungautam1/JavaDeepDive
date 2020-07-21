package encapsulation;

public class EncapRun {
    public static void main(String[] args) {
        EncapTest encap=new EncapTest();
        encap.setName("Arjun Gautam");
        encap.setIdNum("Laser5431");
        encap.setAge(21);
        System.out.println("Id: "+encap.getIdNum()+"\r\nName : "+encap.getName()+"\r\nAge : "+encap.getAge());
    }
}
