package player;

import entities.Player;
import utils.defend.DefendingStrategy;

/**
 * A fake defending strategy for testing purposes.
 * This strategy does not modify the attack value; it returns it as-is.
 */
public class FakeDefendingStrategy implements DefendingStrategy {

    /**
     * Determines the effective damage on the player using this fake strategy.
     *
     * @param attackValue the original attack value before any modifications.
     * @param player      the player who is defending.
     * @return the effective damage, which is the same as the original attack value.
     */
    @Override
    public int effectiveDamage(int attackValue, Player player) {
        return attackValue;
    }
}
