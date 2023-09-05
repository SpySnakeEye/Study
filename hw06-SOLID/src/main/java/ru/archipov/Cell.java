package ru.archipov;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    List<Integer> Banknota = new ArrayList<>();

    public Cell(int nominal) {
    }
    public void take(int money) {
        Banknota.add(money);
    }

    public void get() {
        Banknota.remove(0);
    }

    public int getCount() {
        return Banknota.size();
    }
}
