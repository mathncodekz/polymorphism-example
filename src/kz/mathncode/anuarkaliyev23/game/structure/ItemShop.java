package kz.mathncode.anuarkaliyev23.game.structure;

import kz.mathncode.anuarkaliyev23.game.structure.items.Item;
import kz.mathncode.anuarkaliyev23.game.structure.units.Player;

import java.util.List;

public class ItemShop {
    public ItemShop(List<Item> itemsToSale) {
        this.itemsToSale = itemsToSale;
    }

    public List<Item> getItemsToSale() {
        return itemsToSale;
    }

    public void setItemsToSale(List<Item> itemsToSale) {
        this.itemsToSale = itemsToSale;
    }

    private List<Item> itemsToSale;

    public void sellItem(Item item, Player player) {
        if (player.getMoney() >= item.getPrice()) {
            itemsToSale.remove(item);
            player.setMoney(player.getMoney() - item.getPrice());
            item.effect(player);
        } else {
            throw new RuntimeException("Not enough money");
        }
    }

    @Override
    public String toString() {
        return "ItemShop{" +
                "itemsToSale=" + itemsToSale +
                '}';
    }
}
