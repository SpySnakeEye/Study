package ru.archipov;

public class AlgorithmImpl implements Algorithm {

    int n_5000 = 0;
    int n_1000 = 0;
    int n_500 = 0;
    int n_100 = 0;
    int n_50 = 0;
    int n_10 = 0;

    public void goAlg(int money) {
        n_5000 = (int) Math.floor(money / 5000);
        n_1000 = (int) Math.floor((money - 5000 * n_5000) / 1000);
        n_500 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000) / 500);
        n_100 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500) / 100);
        n_50 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500 - 100 * n_100) / 50);
        n_10 = (int) Math.floor((money - 5000 * n_5000 - 1000 * n_1000 - 500 * n_500 - 100 * n_100 - 50 * n_50) / 10);
    }

    public int getN_5000() {
        return n_5000;
    }

    public int getN_1000() {
        return n_1000;
    }

    public int getN_500() {
        return n_500;
    }

    public int getN_100() {
        return n_100;
    }

    public int getN_50() {
        return n_50;
    }

    public int getN_10() {
        return n_10;
    }

}
