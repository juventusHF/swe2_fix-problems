package ch.juventus.se.problemstofix.bird;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdsTest {

    private BirdController birdController;
    private Bird duck;
    private Bird pigeon;
    private Bird toucan;
    private Bird turkey;

    @BeforeEach
    public void setup () {
        birdController = new BirdController();
        duck = new Duck(2, 500, true);
        pigeon = new Pigeon(1, 300, false);
        toucan = new Toucan(3, 400, true);
        turkey = new Turkey(2, 800, true);
    }

    @Test
    public void shouldAddAllBirds () {
        birdController.addBird(duck);
        birdController.addBird(pigeon);
        birdController.addBird(toucan);
        birdController.addBird(turkey);
        birdController.addBird(toucan);
        birdController.addBird(duck);
        birdController.addBird(pigeon);
        birdController.addBird(turkey);

        assertEquals(8, birdController.getBirdsCount(), "Count of birds not as expected.");
    }


}
