
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (getSquareMeters() > compared.getSquareMeters()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceDifference = getTotalPrice() - compared.getTotalPrice();
        if (priceDifference >= 0) {
            return priceDifference;
        } else {
            return -1 * priceDifference;
        }

    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.pricePerSquare > compared.pricePerSquare) {
            return true;
        }
        return false;
    }

    private int getSquareMeters() {
        return this.squares * this.rooms;
    }

    private int getTotalPrice() {
        return this.pricePerSquare * this.squares;
    }
}
