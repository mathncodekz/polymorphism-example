package kz.mathncode.anuarkaliyev23.game.structure.units;

public class HeroUnit extends ManaUnit {
    private int attack;

    public HeroUnit(int maxHitPoints, int hitPoints, int maxManaPoints, int manaPoints, int attack) {
        super(maxHitPoints, hitPoints, maxManaPoints, manaPoints);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "kz.mathncode.anuarkaliyev23.game.structure.units.HeroUnit{" +
                "attack=" + attack +
                "} " + super.toString();
    }
}
