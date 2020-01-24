package Exercise_2;

import java.util.Objects;

public class Bud {
    // region Properties
    private int lengthOfBud;
    private int price;
    // end Properties

    // region Constructors
    public Bud() {
    }

    public Bud(int lengthOfBud, int price) {
        this.lengthOfBud = lengthOfBud;
        this.price = price;
    }
    // end Constructors

    // region getter and setter
    public int getLengthOfBud() {
        return lengthOfBud;
    }

    public int getPrice() {
        return price;
    }

    public void setLengthOfBud(int lengthOfBud) {
        this.lengthOfBud = lengthOfBud;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // end getter and setter

    // region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return lengthOfBud == bud.lengthOfBud &&
                price == bud.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthOfBud, price);
    }
    // end Overrides

    // region toString
    @Override
    public String toString() {
        return "Bud{" +
                "lengthOfBud=" + lengthOfBud +
                ", price=" + price +
                '}';
    }
    // end toString
}
