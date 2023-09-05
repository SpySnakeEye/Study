package ru.archipov;

public class AlgorithmImpl implements Algorithm {

   private int n_5000;
    private int n_1000;
    private int n_500;
    private  int n_100;
    private int n_50;
    private int n_10;

    public void goAlg(int money) {
        n_5000 = money / 5000;
        n_1000 = (money % 5000) / 1000;
        n_500 = (money % 1000) / 500;
        n_100 = (money % 500) / 100;
        n_50 = (money % 100) / 50;
        n_10 = (money % 50) / 10;
    }

    public int getNumberForDenomination(int denomination) {
        switch (denomination) {
            case 5000:
                return n_5000;
            case 1000:
                return n_1000;
            case 500:
                return n_500;
            case 100:
                return n_100;
            case 50:
                return n_50;
            case 10:
                return n_10;
            default:
                return 0;
        }
    }

}
