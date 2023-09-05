package ru.archipov;

import java.util.List;

public interface ATM {
     void loadMoney(List<Banknota> banknotaArrayList);
     void getMoney(int money);
     int getBalance();
}
