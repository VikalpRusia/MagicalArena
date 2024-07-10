package player;

import entities.Player;
import utils.attack.AttackingStrategy;

public class FakeAttackingStrategy implements AttackingStrategy {
    @Override
    public int calculateDamage(Player player) {
        return player.getAttack() + 1;
    }
}
