import org.junit.jupiter.api.Test;
import utils.Utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for the utility methods in the Utils class.
 */
public class UtilsTest {

    /**
     * Test case for the rollDice method in the Utils class.
     * Verifies that the rollDice method returns values between 1 and 6 (inclusive).
     */
    @Test
    public void testRollingDice() {
        for (int i = 0; i <= 10; i++) {
            assertTrue(1 <= Utils.rollDice() && Utils.rollDice() <= 6);
        }
    }
}
