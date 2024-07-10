import entities.Player;
import entities.SimplePlayer;
import utils.arena.Match;

public class MagicalArena {
    public static void main(String[] args) {
        Player playerA = new SimplePlayer("Player-1", 50, 5, 10);
        Player playerB = new SimplePlayer("Player-2", 100, 10, 5);
        new Match().fight(playerA, playerB);
    }
}
