package ch.juventus.se.problemstofix.bird;

import java.util.Set;

public class BirdController {

    private Set<Bird> birds;

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public int getBirdsCount () {
        return birds.size();
    }

}
