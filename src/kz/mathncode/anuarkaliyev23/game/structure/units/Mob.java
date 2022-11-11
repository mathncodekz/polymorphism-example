package kz.mathncode.anuarkaliyev23.game.structure.units;

public class Mob extends Unit {
    private String name;
    public Mob(int healthPoints, int maxHealthPoints, int attackSpeed, String name) {
        super(healthPoints, maxHealthPoints, attackSpeed);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
