package ru.archipov;

public enum Banknota {

    N_10 (10),
    N_50 (50),
    N_100 (100),
    N_500 (500),
    N_1000 (1000),
    N_5000 (5000);

    public final int nominal;

   Banknota(int nominal) {
       this.nominal = nominal;
    }

    public int getNominal() {
        return nominal;
    }
}