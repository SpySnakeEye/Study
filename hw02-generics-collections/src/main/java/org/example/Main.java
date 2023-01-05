package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new DIYarrayList<>();

// Проверка добавления в myList:
        Integer[] numbers = new Integer[21];
        for (int i = 0; i < 21; i++) {
            numbers[i] = i;
        }
        System.out.println("numbers содержит: " + Arrays.toString(numbers));
        Collections.addAll(myList, numbers);
        System.out.println("myList содержит:  " + myList + "\n");

// Проверка копирования из myList:
        ArrayList<Integer> NumForCopy = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            NumForCopy.add(77);
        }
        System.out.println("NumForCopy содержит: " + NumForCopy);
        Collections.copy(NumForCopy, myList);
        System.out.println("NumForCopy содержит после копирования: " + NumForCopy + "\n");

// Проверка копирования в myList:
        ArrayList<Integer> NumForCopy2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            NumForCopy2.add(88);
        }
        System.out.println("NumForCopy2 содержит: " + NumForCopy2);
        Collections.copy(myList, NumForCopy2);
        System.out.println("myList содержит:      " + myList + "\n");

// Проверка сортировки в myList:
        List<Integer> ArrayForSort = new DIYarrayList<>();
        ArrayForSort.add(8);
        ArrayForSort.add(4);
        ArrayForSort.add(1);
        ArrayForSort.add(5);
        ArrayForSort.add(2);
        ArrayForSort.add(12);
        ArrayForSort.add(15);
        ArrayForSort.add(9);
        ArrayForSort.add(90);
        ArrayForSort.add(63);
        ArrayForSort.add(28);
        ArrayForSort.add(14);
        ArrayForSort.add(11);
        ArrayForSort.add(54);
        ArrayForSort.add(22);
        ArrayForSort.add(31);
        ArrayForSort.add(87);
        ArrayForSort.add(59);
        ArrayForSort.add(80);
        ArrayForSort.add(34);
        ArrayForSort.add(22);
        ArrayForSort.add(17);
        System.out.println("ArrayForSort содержит до сортировки:    " + ArrayForSort);
        Collections.sort(ArrayForSort);
        System.out.println("ArrayForSort содержит после сортировки: " + ArrayForSort);
    }
}
