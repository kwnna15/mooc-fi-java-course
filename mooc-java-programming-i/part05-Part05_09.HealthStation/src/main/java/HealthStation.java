
public class HealthStation {

    private int numWeighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        return this.numWeighings;
    }
}
