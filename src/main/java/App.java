import java.util.ArrayList;

import models.Bird;
import models.voliers.CloseVolier;

public class App {
    public static void main(String[] args) {
        Bird bird1 = null;
        Bird bird2 = null;
        try {
            bird1 = new Bird("Курица", 1, 2.8);
            bird2 = new Bird("Орел", 2, 3.5);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(bird1);
        birds.add(bird2);

        CloseVolier closeVolier = new CloseVolier();
        closeVolier.setBirds(birds);

        System.out.println(closeVolier);
    }
}