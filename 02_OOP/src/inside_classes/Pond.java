package inside_classes;

public class Pond {
    public static void main(String[] args) {
        Duck ducktype1=new Duck("Duck1",90/3,"Rice");
        Duck ducktype2=new Duck("Duck2",90/4,"Wheat");
        ducktype1.quack();
        ducktype2.woddle();
        ducktype2.woddle();

        System.out.println(ducktype1);
      }
}
