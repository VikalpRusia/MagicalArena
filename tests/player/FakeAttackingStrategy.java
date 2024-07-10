package player;

import entities.Player;
import utils.attack.AttackingStrategy;

/**
 * A fake attacking strategy for testing purposes.
 * This strategy simply adds 1 to the player's attack value.
 */
public class FakeAttackingStrategy implements AttackingStrategy {

    /**
     * Calculates the damage dealt by the player using this fake strategy.
     *
     * @param player the player whose attack value is used to calculate the damage.
     * @return the calculated damage, which is the player's attack value plus 1.
     */
    @Override
    public int calculateDamage(Player player) {
        return player.getAttack() + 1;
    }
}
