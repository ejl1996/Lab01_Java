/**
 * Demonstrates good use of control structures.
 *
 * @author Emma Lee
 * @version 2023
 */
public class WarmUp {

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        int maxBars = 0;
        String maxBarsTime = "";

        for (int hour = 1; hour <= 12; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                int totalBars = countBars(hour % 10) + countBars(minute / 10) + countBars(minute % 10);
                if (totalBars > maxBars) {
                    maxBars = totalBars;
                    maxBarsTime = String.format("%02d:%02d", hour, minute);
                }
            }
        }

        System.out.println("The time with the highest number of bars: " + maxBarsTime);
        System.out.println("The total number of bars: " + maxBars);
    }

    /*
     * Calculates and returns the number of bars required to display a digit on a digital display.
     * @param digit an int
     * @return the number of bars needed to represent the specified digit.
     */
    private static int countBars(int digit) {
        int[] bars = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        return bars[digit];
    }
}
