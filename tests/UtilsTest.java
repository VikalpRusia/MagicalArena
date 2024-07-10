import org.junit.jupiter.api.Test;
import utils.Utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void testRollingDice() {
        for (int i = 0; i <= 10; i++) {
            assertTrue(1 <= Utils.rollDice() && Utils.rollDice() <= 6);
        }
    }
}
