package models.voliers;

import java.util.ArrayList;

import models.Bird;

public class CloseVolier {
    
    private ArrayList<Bird> birds;

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Вольер, огороженный сеткой:\n" +
        "Птицы, которые тут есть:\n");
        for (Bird bird : birds) {
            builder.append(bird).append("\n");
        }
        return builder.toString();
    }
}