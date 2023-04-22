package ru.archipov;

import java.util.ArrayList;

public class Cell {
    ArrayList<Integer> cell = new ArrayList<>();

    public void take(int money) {
        cell.add(money);
    }

    public void get() {
        cell.get(0);
        cell.remove(0);
    }

}
