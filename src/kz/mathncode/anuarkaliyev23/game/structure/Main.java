package kz.mathncode.anuarkaliyev23.game.structure;

import kz.mathncode.anuarkaliyev23.game.structure.items.Item;
import kz.mathncode.anuarkaliyev23.game.structure.items.MagicBarbell;
import kz.mathncode.anuarkaliyev23.game.structure.items.ManaPotion;
import kz.mathncode.anuarkaliyev23.game.structure.units.AttackerUnit;
import kz.mathncode.anuarkaliyev23.game.structure.units.HeroUnit;
import kz.mathncode.anuarkaliyev23.game.structure.units.ManaUnit;
import kz.mathncode.anuarkaliyev23.game.structure.units.Unit;

public class Main {
    public static void main(String[] args) {
        HeroUnit heroUnit = new HeroUnit(350, 300, 150, 50, 12);

        Item item = new MagicBarbell(25, 2);
        System.out.println(heroUnit);
        item.effect(heroUnit);
        System.out.println(heroUnit);
    }
}