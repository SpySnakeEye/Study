package ru.archipov;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.takeMoney(10);
        atm.getBalance();
        atm.takeMoney(50);
        atm.getBalance();
        atm.takeMoney(100);
        atm.getBalance();
        atm.takeMoney(500);
        atm.getBalance();
        atm.takeMoney(1000);
        atm.getBalance();
        atm.takeMoney(1000);
        atm.getBalance();
        atm.takeMoney(1000);
        atm.getBalance();
        atm.takeMoney(5000);
        atm.getBalance();
        atm.takeMoney(5000);
        atm.getBalance();
        atm.getMoney(10);
        atm.getBalance();
        atm.getMoney(10);
        atm.getBalance();
        atm.getMoney(5650);
        atm.getBalance();
    }
}