package kz.mathncode.anuarkaliyev23.game.structure.units;

public class Player extends Unit {
    int money;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Player(int healthPoints, int maxHealthPoints, int attackSpeed, int money) {
        super(healthPoints, maxHealthPoints, attackSpeed);
        this.money = money;
    }

    public Player(int healthPoints, int maxHealthPoints, int attackSpeed) {
        super(healthPoints, maxHealthPoints, attackSpeed);
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                "} " + super.toString();
    }
}
