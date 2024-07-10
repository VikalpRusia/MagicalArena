package utils.attack;

import entities.Player;
import utils.Utils;

/**
 * A simple implementation of AttackingStrategy that calculates damage based on the player's attack and a dice roll.
 */
public class SimpleAttackStrategy implements AttackingStrategy {

    /**
     * Calculates the damage inflicted by the player using a simple strategy.
     *
     * @param player the player performing the attack.
     * @return the calculated damage based on the player's attack attribute and a dice roll.
     */
    @Override
    public int calculateDamage(Player player) {
        return player.getAttack() * Utils.rollDice();
    }
}
