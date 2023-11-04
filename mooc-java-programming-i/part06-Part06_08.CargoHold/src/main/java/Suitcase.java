
import java.util.ArrayList;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class Suitcase {

    private final ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        items.forEach((item) -> {
            System.out.println(item);
        });
    }

    public int totalWeight() {
        return items.stream()
                .map(Item::getWeight)
                .reduce(0, Integer::sum);
    }

    public Item heaviestItem() {
        return items.stream()
                .max(Comparator.comparingInt(Item::getWeight))
                .orElse(null);
    }

    public String listItems() {
        String listItems = "";
        for (Item item : items) {
            listItems += item.toString() + "\n";
        }
        return listItems;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
}
