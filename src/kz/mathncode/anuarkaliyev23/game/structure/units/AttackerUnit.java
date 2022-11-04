package kz.mathncode.anuarkaliyev23.game.structure.units;

public class AttackerUnit extends Unit {
    private int attack;

    public AttackerUnit(int maxHitPoints, int hitPoints, int attack) {
        super(maxHitPoints, hitPoints);
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
        return "kz.mathncode.anuarkaliyev23.game.structure.units.AttackerUnit{" +
                "attack=" + attack +
                "} " + super.toString();
    }
}
