package Exercise_2;

import java.util.Objects;

public class Rose extends Petal implements BloomWilt {
    // region Properties
    private int maxLengthOfRose;
    private int price;
    private String plantCountry;
    // end Properties

    // region Constructors
    public Rose() {
    }

    public Rose(int maxLengthOfRose, int price, String plantCountry) {
        this.maxLengthOfRose = maxLengthOfRose;
        this.price = price;
        this.plantCountry = plantCountry;
    }
    // end Constructors

    //region getter and setter

    public int getMaxLengthOfRose() {
        return maxLengthOfRose;
    }

    public int getPrice() {
        return price;
    }

    public String getPlantCountry() {
        return plantCountry;
    }

    public void setMaxLengthOfRose(int maxLengthOfRose) {
        if (maxLengthOfRose > 0 && maxLengthOfRose < 150) {
            this.maxLengthOfRose = maxLengthOfRose;
        } else {
            System.out.println("Length of rose should be > 0 and < 150cm");
        }
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setPlantCountry(String plantCountry) {
        this.plantCountry = plantCountry;
    }
    //end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return price == rose.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
    // end equals and hashCode

    // region toString

    @Override
    public String toString() {
        return "Rose{" +
                "maxLengthOfRose=" + maxLengthOfRose +
                ", price=" + price +
                ", plantCountry='" + plantCountry + '\'' +
                '}';
    }
    // end toString

    // region Overrides
    @Override
    public void bloom() {
        System.out.println("Roses bloom from Spring to Autumn");
    }

    @Override
    public void wilt() {
        System.out.println("Roses do not wilt in Winter");
    }
    // end Overrides

    // region methods
    void printQuantityOfPetals(int quantity){
        super.setQuantity(quantity);
        System.out.println("Quantity of petals = " + super.getQuantity());
    }

    void printBudProperties(){
        Bud bud = new Bud();
        bud.getPrice();
        bud.getLengthOfBud();
    }
    // end methods
}
