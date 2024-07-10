package entities;

import utils.attack.AttackingStrategy;
import utils.defend.DefendingStrategy;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents a player in the game with attributes for health, strength, and attack.
 * The player's health, strength, and attack must be positive values.
 * Health can be zero (indicating the player has died) but not negative.
 */
public class SimplePlayer implements Player {
    private static final Logger logger = Logger.getLogger(SimplePlayer.class.getName());
    private int health;
    // Strength and attack are intentionally not final to allow modification in extended code.
    private int strength;
    private int attack;


    /**
     * Constructs a {@code Player} object with the specified {@code health}, {@code strength}, and {@code attack}.
     *
     * @param health   the health of the player; must be positive.
     * @param strength the strength of the player; must be positive.
     * @param attack   the attack of the player; must be positive.
     * @throws IllegalArgumentException if {@code health}, {@code strength}, or {@code attack} is not positive.
     */
    public SimplePlayer(int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            logger.log(Level.SEVERE, "Health: " + health + ", strength: " + strength + " and attack:" + attack + " cannot be < 0 ");
            throw new IllegalArgumentException("Invalid health, strength or attack");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    @Override
    public int attack(AttackingStrategy attackingStrategy) {
        int attackPower = attackingStrategy.calculateDamage(this);
        logger.log(Level.FINE, "Attack Power: " + attackPower);
        return attackPower;
    }

    @Override
    public void defend(int damage, DefendingStrategy defendingStrategy) {
        int damageTaken = defendingStrategy.effectiveDamage(damage, this);
        logger.log(Level.FINE, "Effective Damage taken: " + damageTaken);
        this.setHealth(health - damageTaken);
    }

    /**
     * Returns the health of the player.
     *
     * @return the current health of the player.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the player. Health can be zero (indicating the player has died) but not negative.
     *
     * @param health the new health value; must not be negative.
     * @throws IllegalArgumentException if {@code health} is negative.
     */
    public void setHealth(int health) {
        // Health can be 0 (player died) but cannot be negative
        if (health < 0) {
            throw new IllegalArgumentException("Invalid health");
        }
        this.health = health;
    }

    /**
     * Returns the strength of the player.
     *
     * @return the strength of the player.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Returns the attack of the player.
     *
     * @return the attack of the player.
     */
    public int getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "Player having current health: " + this.getHealth() + " ,attack: " + this.getAttack() + " ,strength: " + this.getStrength();
    }
}
