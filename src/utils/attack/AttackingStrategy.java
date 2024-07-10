package utils.attack;

import entities.Player;

/**
 * Represents a strategy for calculating attack damage inflicted by a player.
 */
public interface AttackingStrategy {

    /**
     * Calculates the attack damage inflicted by a player based on the strategy implementation.
     *
     * @param player the player performing the attack.
     * @return the calculated attack damage.
     */
    int calculateDamage(Player player);
}
