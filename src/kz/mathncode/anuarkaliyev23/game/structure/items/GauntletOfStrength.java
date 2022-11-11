package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

public class GauntletOfStrength extends Item {
    public GauntletOfStrength(int price) {
        super(price);
    }

    @Override
    public void effect(Player player) {
        player.setAttackSpeed(player.getAttackSpeed() + 5);
    }
}
