package kz.mathncode.anuarkaliyev23.game.structure;

import kz.mathncode.anuarkaliyev23.game.structure.items.BagOfCash;
import kz.mathncode.anuarkaliyev23.game.structure.items.GauntletOfStrength;
import kz.mathncode.anuarkaliyev23.game.structure.items.HealthPotion;
import kz.mathncode.anuarkaliyev23.game.structure.items.Item;
import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item gauntletOfStrength = new GauntletOfStrength(200);
        Item bagOfCash = new BagOfCash(150);


        Player player = new Player(100, 150, 3, 500);

        List<Item> items = new ArrayList<>();
        items.add(bagOfCash);
        items.add(gauntletOfStrength);

        ItemShop shop = new ItemShop(items);
        shop.sellItem(bagOfCash, player);

        System.out.println(player);
        System.out.println(shop);
    }
}
