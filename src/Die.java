import java.util.Random;

/**
 * Die represents a six-sided die.
 *
 * @author BCIT
 * @author Emma Lee
 * @version 2023
 */
public class Die {

    private int faceValue;
    private final int numberOfSides; // New instance variable, marked as final

    private static final int DEFAULT_SIDES = 6; // Default number of sides
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    /**
     * Update constructor to accept numberOfSides and check for minimum sides.
     *
     * @param numberOfSides an int
     */
    public Die(int numberOfSides) {
        final int MINIMUM_SIDES = 2; // Set minimum number of sides to two
        if (numberOfSides < MINIMUM_SIDES) {
            System.out.println("Number of sides must be at least " + MINIMUM_SIDES + ". Setting to default sides: " + DEFAULT_SIDES);
            this.numberOfSides = DEFAULT_SIDES;
        } else {
            this.numberOfSides = numberOfSides;
        }
        this.faceValue = 1;
    }

    /**
     * Update the current face value of die and return the result.
     *
     * @return the updated face value as an int
     */
    public int roll() {
        this.faceValue = RANDOM_NUMBER_GENERATOR.nextInt(numberOfSides) + 1;
        return this.faceValue;
    }

    /**
     * Retrieve and returns the current face value of die.
     *
     * @return the face value as an int
     */
    public int getFaceValue() {
        return this.faceValue;
    }

    /**
     * Returns a String representation of this Die.
     *
     * @return representation as a String
     */
    @Override
    public String toString() {
        return "Die{" + "faceValue=" + this.faceValue + "}";
    }

    /**
     * Retrieves the number of sides of the die.
     *
     * @return The number of sides of the die
     */
    @SuppressWarnings("unused")
    public int getNumberOfSides() {
        return this.numberOfSides;
    }
}


