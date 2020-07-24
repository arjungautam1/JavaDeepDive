package advanced_interface;

import javafx.scene.shape.Circle;

//interface declaration :by first user
interface Drawable{
    void draw();
}
//Implementation by second user

class Rectangle implements Drawable{
    public void draw()
    {
        System.out.println("Drawing Rectangle .");
    }
}


class Square implements Drawable{
    public void draw()
    {
        System.out.println("Drawing Square .");
    }
}

//Using Interface by third user

public class TestInterface {

    public static void main(String[] args) {

//        Drawable drawable= new Circle();
//        drawable.draw();
        //In real scenario, object is provided by method e.g. getDrawable()
    }

}
