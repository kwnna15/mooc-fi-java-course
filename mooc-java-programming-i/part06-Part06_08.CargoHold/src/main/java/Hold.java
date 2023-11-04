
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
public class Hold {

    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        return suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, Integer::sum);
    }

    public void printItems() {
        suitcases.forEach((suitcase) -> {
            System.out.println(suitcase.listItems());
        });
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
