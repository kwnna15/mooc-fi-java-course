
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            String string = "The collection " + this.name + " has " + elements.size() + " " + getElementsSuffix() + ":\n";
            if (elements.size() == 1) {
                string += elements.get(0);
            } else {
                for (String element : elements) {
                    string += element + "\n";
                }
            }
            return string;
        }
    }

    private String getElementsSuffix() {
        if (elements.size() == 1) {
            return "element";
        } else {
            return "elements";
        }
    }
}
