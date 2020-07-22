package inside_classes;

public class Duck {
//    member variables :data(encapsulated /private)
    private String name;
    private int lifeExpectency;
    private String favoriteFood;

    public Duck(String name, int lifeExpectency, String favoriteFood) {
        this.name = name;
        this.lifeExpectency = lifeExpectency;
        this.favoriteFood = favoriteFood;
    }

    //    methods :functionality
    void woddle()
    {
        System.out.println(this.name+" is waddling .");
    }
    void quack()
    {
        System.out.println("quack quack ");
    }

    @Override
    public String toString()
    {
        return "My name is "+this.name+" I like "+this.favoriteFood+ " life expectency :"+this.lifeExpectency;
    }


}
