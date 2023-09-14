import java.util.Random;

/**
 * Die represents a six-sided die.
 *
 * @author BCIT
 * @author YOUR NAME HERE
 * @version VERSION NUMBER HERE
 */
public class Die {

    /**
     * The number of sides.
     */
    public static final int SIDES = 6;
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    private int faceValue;

    /**
     * Constructs a Die object.
     */
    public Die() {
        this.faceValue = 1;
    }

    /**
     * Rolls this Die and returns the result.
     *
     * @return faceValue as an int
     */
    public int roll() {
        this.faceValue = RANDOM_NUMBER_GENERATOR.nextInt(SIDES) + 1;
        return this.faceValue;
    }

    /**
     * Returns the face value of this Die as an int.
     *
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return this.faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     *
     * @param value an int
     */
    public void setFaceValue(final int value) {
        if (value > 0 && value <= SIDES) {
            this.faceValue = value;
        }
    }

    /**
     * Returns a String representation of this Die.
     *
     * @return toString description
     */
    @Override
    public String toString() {
        return "Die{" + "faceValue=" + this.faceValue + "}";
    }

}
