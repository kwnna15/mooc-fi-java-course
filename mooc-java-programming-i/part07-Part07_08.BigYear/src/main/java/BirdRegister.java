
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class BirdRegister {

    private final ArrayList<Bird> birdDatabase;
    private final int observations;

    public BirdRegister() {
        this.birdDatabase = new ArrayList<>();
        this.observations = 0;
    }

    public void add(Bird bird) {
        this.birdDatabase.add(bird);
    }

    public void addObservation(String name) {
        for (Bird bird : birdDatabase) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        birdDatabase.forEach((bird) -> {
            System.out.println(bird);
        });
    }

    public void printOne(String name) {
        birdDatabase.stream()
                .filter((bird) -> (bird.getName().equals(name)))
                .forEach((bird) -> {
                    System.out.println(bird);
                });
    }
}
