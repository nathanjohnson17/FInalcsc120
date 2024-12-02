import java.io.Serializable;

/**
 * Represents a boat in the fleet with attributes such as type, name, year,
 * make/model, length, purchase price, and expenses.
 * Implements Serializable for persistence.
 */
public class Boat implements Serializable {
    private BoatType type; // The type of the boat (e.g., SAILING, POWER)
    private String name; // The name of the boat
    private int year; // The year the boat was manufactured
    private String makeModel; // The make and model of the boat
    private double length; // The length of the boat in feet
    private double purchasePrice; // The purchase price of the boat
    private double expenses; // The total maintenance expenses for the boat

    /**
     * Constructs a new Boat with the specified attributes.
     *
     * @param type The type of the boat (SAILING or POWER).
     * @param name The name of the boat.
     * @param year The year the boat was manufactured.
     * @param makeModel The make and model of the boat.
     * @param length The length of the boat in feet.
     * @param purchasePrice The purchase price of the boat.
     */
    public Boat(BoatType type, String name, int year, String makeModel, double length, double purchasePrice) {
        this.type = type;
        this.name = name;
        this.year = year;
        this.makeModel = makeModel;
        this.length = length;
        this.purchasePrice = purchasePrice;
        this.expenses = 0.0;
    }

    /**
     * Gets the type of the boat.
     *
     * @return The type of the boat (SAILING or POWER).
     */
    public BoatType getType() {
        return type;
    }

    /**
     * Gets the name of the boat.
     *
     * @return The name of the boat.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the year the boat was manufactured.
     *
     * @return The year of manufacture.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the make and model of the boat.
     *
     * @return The make and model as a String.
     */
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * Gets the length of the boat.
     *
     * @return The length of the boat in feet.
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the purchase price of the boat.
     *
     * @return The purchase price.
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Gets the total expenses for the boat.
     *
     * @return The total maintenance expenses.
     */
    public double getExpenses() {
        return expenses;
    }

    /**
     * Adds an expense to the total expenses for the boat.
     *
     * @param amount The expense amount to add.
     */
    public void addExpense(double amount) {
        this.expenses += amount;
    }

    /**
     * Returns a formatted string representation of the boat's details.
     *
     * @return A formatted string with the boat's attributes.
     */
    @Override
    public String toString() {
        return String.format("    %-8s%-20s%4d %-10s%5.0f' : Paid $%9.2f : Spent $%10.2f",
                type.toString() + " ",
                name,
                year,
                makeModel,
                length,
                purchasePrice,
                expenses);
    }
}

