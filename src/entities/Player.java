package entities;

/**
 * Represents a player in the game with attributes for health, strength, and attack.
 * The player's health, strength, and attack must be positive values.
 * Health can be zero (indicating the player has died) but not negative.
 */
public class Player {

    private int health;
    // Strength and attack are intentionally not final to allow modification in extended code.
    private int strength;
    private int attack;

    /**
     * Constructs a {@code Player} object with the specified {@code health}, {@code strength}, and {@code attack}.
     *
     * @param health the health of the player; must be positive.
     * @param strength the strength of the player; must be positive.
     * @param attack the attack of the player; must be positive.
     * @throws IllegalArgumentException if {@code health}, {@code strength}, or {@code attack} is not positive.
     */
    public Player(int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack<=0) {
            throw new IllegalArgumentException("Invalid health, strength or attack");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
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
}
