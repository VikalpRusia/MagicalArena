package utils.defend;

import entities.Player;
import utils.Utils;

/**
 * A simple implementation of DefendingStrategy that calculates effective damage defended by the player based on their strength and a dice roll.
 */
public class SimpleDefendStrategy implements DefendingStrategy {

    /**
     * Calculates the effective damage defended by the player using a simple strategy.
     *
     * @param attackValue the damage value received from the attacker.
     * @param player      the player defending against the attack.
     * @return the effective damage taken by the player, considering their strength and a dice roll.
     */
    @Override
    public int effectiveDamage(int attackValue, Player player) {
        // Calculate defendedDamage using player's strength and a dice roll
        int defendedDamage = player.getStrength() * Utils.rollDice();

        // Calculate effective damage after defending, ensuring it's not negative
        int effectiveDamage = Math.max(attackValue - defendedDamage, 0);

        // returning damages
        return player.getHealth() - effectiveDamage < 0 ? player.getHealth() : effectiveDamage;
    }
}
