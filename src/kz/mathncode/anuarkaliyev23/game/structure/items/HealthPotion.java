package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.HeroUnit;

public class HealthPotion extends Item {
    private int healthRestored;

    public HealthPotion(int healthRestored) {
        this.healthRestored = healthRestored;
    }

    public int getHealthRestored() {
        return healthRestored;
    }

    public void setHealthRestored(int healthRestored) {
        this.healthRestored = healthRestored;
    }

    @Override
    public void effect(HeroUnit unit) {
        if (unit.getHealthPoints() + healthRestored <= unit.getMaxHealthPoints()) {
            unit.setHealthPoints(unit.getHealthPoints() + healthRestored);
        } else {
            unit.setHealthPoints(unit.getMaxHealthPoints());
        }
    }
}
