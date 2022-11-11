package kz.mathncode.anuarkaliyev23.game.structure.items;

import kz.mathncode.anuarkaliyev23.game.structure.ItemShop;
import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

import java.util.concurrent.ThreadLocalRandom;

public class BagOfCash extends Item {
    public BagOfCash(int price) {
        super(price);
    }

    @Override
    public void effect(Player player) {
        int randomMoney = ThreadLocalRandom.current().nextInt(0, getPrice() * 2);
        player.setMoney(player.getMoney() + randomMoney);
    }
}
