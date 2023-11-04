/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kwnna
 */
public class Bird {

    private final String name;
    private final String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public void addObservation() {
        this.observation++;
    }

    public int getObservation() {
        return observation;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public String toString() {
        return name + "(" + latinName + "): " + observation + " observations";
    }
}
