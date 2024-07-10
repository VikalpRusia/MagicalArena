package player;

import entities.Player;
import entities.SimplePlayer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * This class provides unit test cases for the Player class creation.
 */
public class PlayerUnitTest {

    /**
     * Test case for player creation.
     */
    @Test
    public void testPlayerCreation() {

        Player player = new SimplePlayer("Player-1", 10, 20, 30);

        assertEquals("Player-1", player.getName());
        assertEquals(10, player.getHealth());
        assertEquals(20, player.getStrength());
        assertEquals(30, player.getAttack());

    }

    /**
     * Test case for invalid health values during player creation.
     */
    @Test
    public void testInvalidHealthCreation() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", -10, 20, 30));
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", 0, 20, 30));
    }

    /**
     * Test case for invalid strength values during player creation.
     */
    @Test
    public void testInvalidStrengthCreation() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", 10, -10, 30));
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", 10, 0, 30));

    }

    /**
     * Test case for invalid attack values during player creation.
     */
    @Test
    public void testInvalidAttackCreation() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", 10, 10, -30));
        assertThrows(IllegalArgumentException.class,
                () -> new SimplePlayer("Player-1", 10, 30, 0));
    }

    /**
     * Test case for player's attack.
     */
    @Test
    public void testAttack() {
        Player player = new SimplePlayer("Player-1", 10, 20, 30);
        assertEquals(31, player.attack(new FakeAttackingStrategy()));
    }

    /**
     * Test case for player's defence.
     */
    @Test
    public void testDefence() {
        Player player = new SimplePlayer("Player-1", 100, 20, 30);
        player.defend(30, new FakeDefendingStrategy());
        assertEquals(70, player.getHealth());

        player.defend(100, new FakeDefendingStrategy());
        assertEquals(0, player.getHealth());
    }

    /**
     * Test case for player's toString method.
     */
    @Test
    public void testToString() {
        Player player = new SimplePlayer("Player-1", 100, 20, 30);
        assertEquals("Player Player-1 ,having current health: 100 ,attack: 30 ,strength: 20", player.toString());
    }
}
