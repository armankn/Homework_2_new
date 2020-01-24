package Exercise_2;

public class Petal {
    // region Properties
    private String state;
    private int quantity;
    // end Properties

    // region Constructors
    public Petal() {
    }

    public Petal(String state, int quantity) {
        this.state = state;
        this.quantity = quantity;
    }
    // end Constructors

    // region getter and setter

    public String getState() {
        return state;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        } else {
            System.out.println("Petal quantity should be positive number");
        }
    }
    // end getter and setter
}
