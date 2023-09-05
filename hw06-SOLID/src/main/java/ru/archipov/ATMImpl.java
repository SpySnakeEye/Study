package ru.archipov;

import java.util.List;
import java.util.Map;

public class ATMImpl implements ATM {
    private Map<Integer, Cell> cells;

    private Algorithm algorithm;

    public ATMImpl(Map<Integer, Cell> cells, Algorithm algorithm) {
        this.cells = cells;
        this.algorithm = algorithm;
    }

    public void loadMoney(List<Banknota> banknotaArrayList) {
        for (Banknota banknotas : banknotaArrayList) {
            Integer nominal = banknotas.getNominal();
            if (!cells.containsKey(nominal)) {
                System.out.println("Банкноты номиналом в " + nominal + " рублей не существует, внесите другую банкноту!");
                continue;
            }
            cells.get(nominal).take(nominal);
            System.out.println("Наличность в размере " + nominal + " рублей принята!");
        }
    }

    public void getMoney(int money) {
        if (getBalance() < money || money % 10 != 0) {
            System.out.println("Ошибка, выберите другую сумму!");
            return;
        }

        algorithm.goAlg(money);

        int[] denominations = {5000, 1000, 500, 100, 50, 10};

        for (int denomination : denominations) {
            if (cells.get(denomination).Banknota.size() >= algorithm.getNumberForDenomination(denomination)) {
                for (int i = 0; i < algorithm.getNumberForDenomination(denomination); i++) {
                    cells.get(denomination).get();
                    System.out.println("Возьмите купюру в " + denomination + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + denomination + " рублей закончились, выберете другую сумму!");
            }
        }
    }

    public int getBalance() {
        int balanceSum = 0;
        for (Map.Entry<Integer, Cell> entry : cells.entrySet()) {
            int nominal = entry.getKey();
            int count = entry.getValue().getCount();
            int nominalBalance = nominal * count;
            balanceSum += nominalBalance;
        }
        System.out.println("Остаток денежных средств " + balanceSum + " рублей!");
        return balanceSum;
    }

}