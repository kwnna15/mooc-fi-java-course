/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kwnna
 */
public class Container {

    private static final int MAX_VOLUME = 100;

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        } else if ((this.amount + amount) <= MAX_VOLUME) {
            this.amount += amount;
        } else {
            this.amount = MAX_VOLUME;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        } else if ((this.amount - amount) >= 0) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }
    }

    @Override
    public String toString() {
        return this.amount + "/" + MAX_VOLUME;
    }
}
