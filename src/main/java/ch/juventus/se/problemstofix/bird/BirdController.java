package ch.juventus.se.problemstofix.bird;

import java.util.ArrayList;
import java.util.List;

public class BirdController {

    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public int getBirdsCount () {
        return birds.size();
    }

}
