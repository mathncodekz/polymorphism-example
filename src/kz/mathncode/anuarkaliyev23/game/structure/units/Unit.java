package kz.mathncode.anuarkaliyev23.game.structure.units;

public abstract class Unit {
    private int healthPoints;
    private int maxHealthPoints;
    private int attackSpeed;

    public Unit(int healthPoints, int maxHealthPoints, int attackSpeed) {
        this.healthPoints = healthPoints;
        this.maxHealthPoints = maxHealthPoints;
        this.attackSpeed = attackSpeed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "healthPoints=" + healthPoints +
                ", maxHealthPoints=" + maxHealthPoints +
                ", attackSpeed=" + attackSpeed +
                '}';
    }
}
