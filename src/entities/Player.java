package entities;

import utils.attack.AttackingStrategy;
import utils.defend.DefendingStrategy;

/**
 * Represents a player in a game with attack and defense capabilities.
 */
public interface Player {

    /**
     * Performs an attack using the specified attacking strategy.
     *
     * @param attackingStrategy the strategy used to calculate the attack damage.
     * @return the damage inflicted on the opponent.
     */
    int attack(AttackingStrategy attackingStrategy);

    /**
     * Defends against incoming damage using the specified defending strategy.
     *
     * @param damage            the damage received from the attacker.
     * @param defendingStrategy the strategy used to calculate the effective damage defended.
     */
    void defend(int damage, DefendingStrategy defendingStrategy);

    /**
     * Retrieves the current health of the player.
     *
     * @return the current health value of the player.
     */
    int getHealth();

    /**
     * Retrieves the strength attribute of the player.
     *
     * @return the strength attribute of the player.
     */
    int getStrength();

    /**
     * Retrieves the attack attribute of the player.
     *
     * @return the attack attribute of the player.
     */
    int getAttack();

    /**
     * Retrieves the name attribute of the player.
     *
     * @return the name attribute of the player.
     */
    String getName();
}
