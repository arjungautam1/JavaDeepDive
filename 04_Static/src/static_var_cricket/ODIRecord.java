package static_var_cricket;

import static_var_cricket.Crickter;

public class ODIRecord {
    public static void main(String[] args) {
        Crickter abd=new Crickter("Develliers",55);
        Crickter kohli=new Crickter("Virat",60);

        abd.setNation("South Africa");
        kohli.setNation("India");

        Crickter.setLeagueClub("RCB");



        System.out.println(abd);
        System.out.println(kohli);


        System.out.println("Number of years played :"+Crickter.getYears());
    }
}
