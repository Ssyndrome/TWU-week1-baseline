package bester;

public class Cookie implements Bestful{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public int hashCode() {
        return numberOfChocolateChips;
    }

    @Override
    public boolean equals(Object obj) {
        return this.numberOfChocolateChips == ((Cookie)obj).numberOfChocolateChips;
    }

    @Override
    public boolean compareTo(Bestful bestful) {
        return this.numberOfChocolateChips >= bestful.hashCode();
    }
}
