package Exercise_1;

import java.util.Objects;

public class Door extends Property {
    // region Properties
    private String color;
    private String state;
    // end Properties

    // region Constructors
    public Door() {
    }

    public Door(String color, String state) {
        this.color = color;
        this.state = state;
    }
    //end Constructors

    // region getter and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Objects.equals(color, door.color) &&
                Objects.equals(state, door.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, state);
    }
    // end equals and hashCode

    // region Methods
    void printQuantityOfDoors(int quantity){
        super.setQuantity(quantity);
        System.out.println("Quantity of door = " + super.getQuantity());
    }

    void printMaterialOfDoors(String material){
        super.setMaterial(material);
        System.out.println("The door is from " + super.getMaterial());
    }
    //end Methods
}
