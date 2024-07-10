package utils.defend;

import entities.Player;

/**
 * Represents a strategy for calculating effective damage defended by a player.
 */
public interface DefendingStrategy {

    /**
     * Calculates the effective damage defended by a player based on the strategy implementation.
     *
     * @param attackValue the damage value received from the attacker.
     * @param player      the player defending against the attack.
     * @return the effective damage taken by the player.
     */
    int effectiveDamage(int attackValue, Player player);
}
