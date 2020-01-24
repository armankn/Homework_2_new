package Exercise_1;

import java.util.Objects;

public class Window extends Property {

    // region Properties
    private String color;
    private String state;
    // end Properties

    // region Constructors
    public Window() {
    }

    public Window(String color, String state) {
        this.color = color;
        this.state = state;
    }
    //end Constructors

    // region getter setter
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
    // end getter setter

    // region equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(color, window.color) &&
                Objects.equals(state, window.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, state);
    }

    // end equals and hashCode

    // region Methods
    void printQuantityOfWindows(int quantity){
        super.setQuantity(quantity);
        System.out.println("Quantity of window = " + super.getQuantity());
    }

    void printMaterialOfDoors(String material){
        super.setMaterial(material);
        System.out.println("The window is from " + super.getMaterial());
    }

    // end Methods
}
