package kz.mathncode.anuarkaliyev23.game.structure.units;

public class ManaUnit extends Unit {
    private int maxManaPoints;
    private int manaPoints;

    public ManaUnit(int maxHitPoints, int hitPoints, int maxManaPoints, int manaPoints) {
        super(maxHitPoints, hitPoints);
        this.maxManaPoints = maxManaPoints;
        this.manaPoints = manaPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    @Override
    public String toString() {
        return "kz.mathncode.anuarkaliyev23.game.structure.units.ManaUnit{" +
                "maxManaPoints=" + maxManaPoints +
                ", manaPoints=" + manaPoints +
                "} " + super.toString();
    }
}
