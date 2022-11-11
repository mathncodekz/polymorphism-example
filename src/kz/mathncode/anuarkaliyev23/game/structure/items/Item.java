package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

public class Item {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(int price) {
        this.price = price;
    }

    public void effect(Player player) {
        throw new RuntimeException();
    }
}
