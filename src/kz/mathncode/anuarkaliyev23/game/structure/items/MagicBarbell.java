package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.HeroUnit;

public class MagicBarbell extends Item {
    private int manaConsumed;
    private int attackGained;

    public MagicBarbell(int manaConsumed, int attackGained) {
        this.manaConsumed = manaConsumed;
        this.attackGained = attackGained;
    }

    public int getManaConsumed() {
        return manaConsumed;
    }

    public void setManaConsumed(int manaConsumed) {
        this.manaConsumed = manaConsumed;
    }

    public int getAttackGained() {
        return attackGained;
    }

    public void setAttackGained(int attackGained) {
        this.attackGained = attackGained;
    }

    @Override
    public void effect(HeroUnit unit) {
        unit.setManaPoints(unit.getManaPoints() - manaConsumed);
        unit.setAttack(unit.getAttack() + attackGained);
    }
}
