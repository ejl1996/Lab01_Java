import java.util.Random;

/**
 * Die represents a six-sided die.
 *
 * @author BCIT
 * @author Emma Lee 
 * @version 2023
 */
public class Die {

    /**
     * The number of sides.
     */
    private int faceValue;
    private final int numberOfSides; // New instance variable, mark as final

    private static final int MINIMUM_SIDES = 2; // Minimum number of sides allowed

    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    /**
     * Update constructor to accept numberOfSides and check for minimum sides.
     *
     * @param numberOfSides an int
     */
    public Die(int numberOfSides) {
        if (numberOfSides < MINIMUM_SIDES) {
            throw new IllegalArgumentException("Number of sides must be at least " + MINIMUM_SIDES);
        }
        this.numberOfSides = numberOfSides;
        this.faceValue = 1;
    }

    /**
     * Return a face value.
     */
    public int roll() {
        this.faceValue = RANDOM_NUMBER_GENERATOR.nextInt(numberOfSides) + 1;
        return this.faceValue;
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    // New method to get the number of sides (accessor only)
    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    @Override
    public String toString() {
        return "Die{" + "faceValue=" + this.faceValue + "}";
    }
}
