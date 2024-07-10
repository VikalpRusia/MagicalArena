package player;

import entities.Player;
import utils.defend.DefendingStrategy;

public class FakeDefendingStrategy implements DefendingStrategy {

    @Override
    public int effectiveDamage(int attackValue, Player player) {
        return attackValue;
    }
}
