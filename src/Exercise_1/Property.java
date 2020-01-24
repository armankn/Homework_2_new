package Exercise_1;

import java.util.Objects;

public class Property {
    // region Properties
    private int quantity;
    private String material;
    // end Properties

    // region Constructors
    public Property() {
    }

    public Property(int quantity, String material) {
        this.quantity = quantity;
        this.material = material;
    }
    // end Constructors

    // region getter setter
    public int getQuantity() {
        return quantity;
    }

    public String getMaterial() {
        return material;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        } else {
            System.out.println("Quantity should be positive number");
        }
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    // end getter setter

    // region Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return quantity == property.quantity &&
                Objects.equals(material, property.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, material);
    }
    // end Overrides

    // region toString
    @Override
    public String toString() {
        return "Property{" +
                "quantity=" + quantity +
                ", material='" + material + '\'' +
                '}';
    }
    // end toString
}
