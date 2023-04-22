package ru.archipov;

public class ATM {
    private int balance;

    Cell cell_10 = new Cell();
    Cell cell_50 = new Cell();
    Cell cell_100 = new Cell();
    Cell cell_500 = new Cell();
    Cell cell_1000 = new Cell();
    Cell cell_5000 = new Cell();

    public void takeMoney(int money) {
        if (money == 10) {
            cell_10.take(money);
        } else if (money == 50) {
            cell_50.take(money);
        } else if (money == 100) {
            cell_100.take(money);
        } else if (money == 500) {
            cell_500.take(money);
        } else if (money == 1000) {
            cell_1000.take(money);
        } else if (money == 5000) {
            cell_5000.take(money);
        }

        balance = balance + money;
        System.out.println("Наличность в размере " + money + " рублей принята!");
    }

    public void getMoney(int money) {
        int n_5000 = 0;
        int n_1000 = 0;
        int n_500 = 0;
        int n_100 = 0;
        int n_50 = 0;
        int n_10 = 0;

        n_5000 = (int) Math.floor(money / 5000);
        n_1000 = (int) Math.floor((money - 5000 * n_5000) / 1000);
        n_500 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000) / 500);
        n_100 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500) / 100);
        n_50 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500 - 100 * n_100) / 50);
        n_10 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500 - 100 * n_100 - 50 * n_50) / 10);

        if (balance < money || money % 10 != 0) {
            System.out.println("Ошибка, выберите другую сумму!");
            return;
        } else {
            if (cell_5000.cell.size() >= n_5000) {
                for (int i = 0; i < n_5000; i++) {
                    cell_5000.get();
                    System.out.println("Возмите купюру в " + 5000 + " рублей!");
                }
                balance = balance - 5000 * n_5000;
            } else {
                System.out.println("Купюры в " + 5000 + " рублей закончились, выберете другую сумму!");
            }
            if (cell_1000.cell.size() >= n_1000) {
                for (int i = 0; i < n_1000; i++) {
                    cell_1000.get();
                    System.out.println("Возмите купюру в " + 1000 + " рублей!");
                }
                balance = balance - 1000 * n_1000;
            } else {
                System.out.println("Купюры в " + 1000 + " рублей закончились, выберете другую сумму!");
            }
            if (cell_500.cell.size() >= n_500) {
                for (int i = 0; i < n_500; i++) {
                    cell_500.get();
                    System.out.println("Возмите купюру в " + 500 + " рублей!");
                }
                balance = balance - 500 * n_500;
            } else {
                System.out.println("Купюры в " + 500 + " рублей закончились, выберете другую сумму!");
            }
            if (cell_100.cell.size() >= n_100) {
                for (int i = 0; i < n_100; i++) {
                    cell_100.get();
                    System.out.println("Возмите купюру в " + 100 + " рублей!");
                }
                balance = balance - 100 * n_100;
            } else {
                System.out.println("Купюры в " + 100 + " рублей закончились, выберете другую сумму!");
            }
            if (cell_50.cell.size() >= n_50) {
                for (int i = 0; i < n_50; i++) {
                    cell_50.get();
                    System.out.println("Возмите купюру в " + 50 + " рублей!");
                }
                balance = balance - 50 * n_50;
            } else {
                System.out.println("Купюры в " + 50 + " рублей закончились, выберете другую сумму!");
            }
            if (cell_10.cell.size() >= n_10) {
                for (int i = 0; i < n_10; i++) {
                    cell_10.get();
                    System.out.println("Возмите купюру в " + 10 + " рублей!");
                }
                balance = balance - 10 * n_10;
            } else {
                System.out.println("Купюры в " + 10 + " рублей закончились, выберете другую сумму!");
            }
        }
    }
    public void getBalance() {
        System.out.println("Остаток денежных средств " + balance + " рублей!");
    }
}