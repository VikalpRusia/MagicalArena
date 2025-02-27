package utils;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Utility class for common operations.
 */
public class Utils {
    private static final Logger logger = Logger.getLogger(Utils.class.getName());
    static Random random = new Random();

    /**
     * Rolls a six-sided dice and returns the result.
     *
     * @return an integer representing the result of the dice roll (1 to 6).
     */
    public static int rollDice() {
        int dice = random.nextInt(6) + 1;
        logger.log(Level.FINE, "number on dice rolled: " + dice);
        return dice;
    }
}
