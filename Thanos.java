import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>();

        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron Man", 48);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero spiderMan = new Hero("Spider-Man", 18);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(spiderMan);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        thor.setAge(1501);

        Collections.shuffle(heroes);

        heroes = new ArrayList<Hero>(heroes.subList(0, heroes.size()/2));

        for (Hero item : heroes) {
            System.out.println(item.getName());
        }
    }
}