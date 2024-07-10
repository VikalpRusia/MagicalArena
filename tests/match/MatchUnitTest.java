package match;

import entities.Player;
import entities.SimplePlayer;
import org.junit.jupiter.api.Test;
import player.FakeAttackingStrategy;
import player.FakeDefendingStrategy;
import utils.arena.Match;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class provides unit test cases for the Match class.
 */
public class MatchUnitTest {
    /**
     * Test case where Player 1 (P1) wins the match.
     */
    @Test
    public void testP1WinsMatch() {
        Match match = new Match();
        Player P1 = new SimplePlayer("Player-1", 100, 100, 100);
        Player P2 = new SimplePlayer("Player-2", 1, 1, 1);
        assertEquals(P1, match.fight(P1, P2));
    }

    /**
     * Test case where Player 2 (P2) wins the match.
     */
    @Test
    public void testP2WinsMatch() {
        Match match = new Match();
        Player P1 = new SimplePlayer("Player-1", 1, 1, 1);
        Player P2 = new SimplePlayer("Player-2", 100, 100, 100);
        assertEquals(P2, match.fight(P1, P2));
    }

    /**
     * Test case for changed strategies in the match.
     */
    @Test
    public void testChangedStrategy() {
        Match match = new Match(new FakeAttackingStrategy(), new FakeDefendingStrategy());
        Player P1 = new SimplePlayer("Player-1", 100, 100, 100);
        Player P2 = new SimplePlayer("Player-2", 1, 1, 1);
        assertEquals(P1, match.fight(P1, P2));

    }
}
