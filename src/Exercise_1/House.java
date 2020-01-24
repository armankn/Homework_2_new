package Exercise_1;

import java.util.Objects;

public class House {
    // region Properties
    private double areaOfHouse;
    private int floorNumberOfHouse;
    // end Properties

    // region Constructors
    public House() {
    }

    public House(double areaOfHouse, int floorNumberOfHouse) {
        this.areaOfHouse = areaOfHouse;
        this.floorNumberOfHouse = floorNumberOfHouse;
    }
    //end Constructors

    // region getter setter

    public double getAreaOfHouse() {
        return areaOfHouse;
    }

    public int getFloorNumberOfHouse() {
        return floorNumberOfHouse;
    }

    public void setAreaOfHouse(double areaOfHouse) {
        this.areaOfHouse = areaOfHouse;
    }

    public void setFloorNumberOfHouse(int floorNumberOfHouse) {
        this.floorNumberOfHouse = floorNumberOfHouse;
    }
    // end getter setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Double.compare(house.areaOfHouse, areaOfHouse) == 0 &&
                floorNumberOfHouse == house.floorNumberOfHouse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaOfHouse, floorNumberOfHouse);
    }
    // end equals and hashCode

    // region to String
    @Override
    public String toString() {
        return "House{" +
                "areaOfHouse=" + areaOfHouse +
                ", floorNumberOfHouse=" + floorNumberOfHouse +
                '}';
    }
    // end to String

    // region methods
    void propertiesOfHouse(){
        Window window = new Window();
        window.setQuantity(7);
        window.printQuantityOfWindows(window.getQuantity());
        window.printMaterialOfDoors("steel");

        Door door = new Door();
        door.setQuantity(10);
        door.printQuantityOfDoors(door.getQuantity());
        door.printMaterialOfDoors("wood");
    }
    // end methods
}
