package Exercise_3;

import java.util.Objects;

public class Leaf {
    // region Properties
    private String color;
    // end Properties

    // region Constructors
    public Leaf() {
    }

    public Leaf(String color) {
        this.color = color;
    }
    // end Constructors

    // region getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(color, leaf.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                '}';
    }
    // end toString

    // region abstract methods
    void makeLeafsYellow(){
        setColor("Yellow");
    }
    void makeLeafsFall(){
        System.out.println("leaves fall");
    }
    // end abstract methods

}
