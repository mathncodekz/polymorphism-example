package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.HeroUnit;

public class ManaPotion extends Item {
    private int manaRestored;

    public int getManaRestored() {
        return manaRestored;
    }

    public void setManaRestored(int manaRestored) {
        this.manaRestored = manaRestored;
    }

    public ManaPotion(int manaRestored) {
        this.manaRestored = manaRestored;
    }

    @Override
    public void effect(HeroUnit unit) {
        if (unit.getManaPoints() + manaRestored <= unit.getMaxManaPoints()) {
            unit.setManaPoints(unit.getManaPoints() + manaRestored);
        } else {
            unit.setManaPoints(unit.getMaxManaPoints());
        }
    }
}
