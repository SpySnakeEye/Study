package ru.archipov;

import java.util.List;
import java.util.Map;

public class ATMImpl implements ATM {
    private Map<Integer, Cell> cells;

    Algorithm algorithm;

    ATMImpl (Map<Integer, Cell> cells, Algorithm algorithm) {
        this.cells = cells;
        this.algorithm = algorithm;
    }

    public void loadMoney(List<Banknota> banknotaArrayList) {
      for (Banknota banknotas : banknotaArrayList) {
          if (banknotas.getNominal() == 10) {
              cells.get(10).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else if (banknotas.getNominal() == 50) {
              cells.get(50).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else if (banknotas.getNominal() == 100) {
              cells.get(100).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else if (banknotas.getNominal() == 500) {
              cells.get(500).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else if (banknotas.getNominal() == 1000) {
              cells.get(1000).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else if (banknotas.getNominal() == 5000) {
              cells.get(5000).take(banknotas.getNominal());
              System.out.println("Наличность в размере " + banknotas.getNominal() + " рублей принята!");
          } else {
              System.out.println("Банкноты номиналом в " + banknotas.getNominal() + " рублей не существует, внесите другую банкноту!");
          }
      }
    }

    public void getMoney(int money) {

        if (getBalance() < money || money % 10 != 0) {
            System.out.println("Ошибка, выберите другую сумму!");
        } else {

            algorithm.goAlg(money);

            if (cells.get(5000).cell.size() >= algorithm.getN_5000()) {
                for (int i = 0; i < algorithm.getN_5000(); i++) {
                    cells.get(5000).get();
                    System.out.println("Возмите купюру в " + 5000 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 5000 + " рублей закончились, выберете другую сумму!");
            }
            if (cells.get(1000).cell.size() >= algorithm.getN_1000()) {
                for (int i = 0; i < algorithm.getN_1000(); i++) {
                    cells.get(1000).get();
                    System.out.println("Возмите купюру в " + 1000 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 1000 + " рублей закончились, выберете другую сумму!");
            }
            if (cells.get(500).cell.size() >= algorithm.getN_500()) {
                for (int i = 0; i < algorithm.getN_500(); i++) {
                    cells.get(500).get();
                    System.out.println("Возмите купюру в " + 500 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 500 + " рублей закончились, выберете другую сумму!");
            }
            if (cells.get(100).cell.size() >= algorithm.getN_100()) {
                for (int i = 0; i < algorithm.getN_100(); i++) {
                    cells.get(100).get();
                    System.out.println("Возмите купюру в " + 100 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 100 + " рублей закончились, выберете другую сумму!");
            }
            if (cells.get(50).cell.size() >= algorithm.getN_50()) {
                for (int i = 0; i < algorithm.getN_50(); i++) {
                    cells.get(50).get();
                    System.out.println("Возмите купюру в " + 50 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 50 + " рублей закончились, выберете другую сумму!");
            }
            if (cells.get(10).cell.size() >= algorithm.getN_10()) {
                for (int i = 0; i < algorithm.getN_10(); i++) {
                    cells.get(10).get();
                    System.out.println("Возмите купюру в " + 10 + " рублей!");
                }
            } else {
                System.out.println("Купюры в " + 10 + " рублей закончились, выберете другую сумму!");
            }
        }
    }
    public int getBalance() {
        int balance_10 = 0;
        int balance_50 = 0;
        int balance_100 = 0;
        int balance_500 = 0;
        int balance_1000 = 0;
        int balance_5000 = 0;

       for (int i = 0; i < cells.get(10).cell.size(); i++) {
           balance_10 = balance_10 + cells.get(10).cell.get(i);
       }
        for (int i = 0; i < cells.get(50).cell.size(); i++) {
            balance_50 = balance_50 + cells.get(50).cell.get(i);
        }
        for (int i = 0; i < cells.get(100).cell.size(); i++) {
            balance_100 = balance_100 + cells.get(100).cell.get(i);
        }
        for (int i = 0; i < cells.get(500).cell.size(); i++) {
            balance_500 = balance_500 + cells.get(500).cell.get(i);
        }
        for (int i = 0; i < cells.get(1000).cell.size(); i++) {
            balance_1000 = balance_1000 + cells.get(1000).cell.get(i);
        }
        for (int i = 0; i < cells.get(5000).cell.size(); i++) {
            balance_5000 = balance_5000 + cells.get(5000).cell.get(i);
        }

        int balance_Summ = balance_10 + balance_50 + balance_100 + balance_500 + balance_1000 + balance_5000;
        System.out.println("Остаток денежных средств " + balance_Summ + " рублей!");
        return balance_Summ;
    }
}