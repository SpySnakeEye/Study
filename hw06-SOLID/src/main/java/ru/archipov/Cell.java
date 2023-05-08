package ru.archipov;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    int nominal;
    List<Integer> cell = new ArrayList<>();

    Cell(int nominal) {
        this.nominal = nominal;
    }
    public void take(int money) {
        cell.add(money);
    }

    public void get() {
        cell.remove(0);
    }

}
