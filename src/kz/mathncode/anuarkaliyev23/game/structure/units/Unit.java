package kz.mathncode.anuarkaliyev23.game.structure.units;

public class Unit {
    private int maxHealthPoints;
    private int healthPoints;

    public Unit(int maxHitPoints, int hitPoints) {
        this.maxHealthPoints = maxHitPoints;
        this.healthPoints = hitPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "kz.mathncode.anuarkaliyev23.game.structure.units.Unit{" +
                "maxHitPoints=" + maxHealthPoints +
                ", hitPoints=" + healthPoints +
                '}';
    }
}
