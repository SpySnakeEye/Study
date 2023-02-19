package ru.archipov;

import org.example.DIYarrayList;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import ru.archipov.TestRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassTest {

    static List<Integer> myList;
    Integer[] numbers;

    List<Integer> ArrayForSort;
    @Before
    public static void BeforeClass() {
        System.out.println("\nBeforeClass beginning!\n");
        myList = new DIYarrayList<>();
    }

    @Test
    public void AddToMyList() {
        numbers = new Integer[21];
        for (int i = 0; i < 21; i++) {
            numbers[i] = i;
        }
        System.out.println("Test beginning:");
        System.out.println("numbers содержит: " + Arrays.toString(numbers));
        Collections.addAll(myList, numbers);
        System.out.println("myList содержит:  " + myList + "\n");
        if (numbers.length != 21) {
            throw new AssertionError("Не верно!");
        }

    }

    @Test
    public void CopyToMyList() {
        ArrayList<Integer> NumForCopy = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            NumForCopy.add(77);
        }
        System.out.println("Test beginning:");
        System.out.println("NumForCopy содержит: " + NumForCopy);
        Collections.copy(NumForCopy, myList);
        System.out.println("NumForCopy содержит после копирования: " + NumForCopy + "\n");
        if (NumForCopy.size() != 26) {
            throw new AssertionError("Не верно!");
        }
    }
    @Test
    public void SortMyList() {
        ArrayForSort = new DIYarrayList<>();
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
        System.out.println("Test beginning:");
        System.out.println("ArrayForSort содержит до сортировки:    " + ArrayForSort);
        Collections.sort(ArrayForSort);
        System.out.println("ArrayForSort содержит после сортировки: " + ArrayForSort + "\n");
        if (ArrayForSort.size() != 22) {
            throw new AssertionError("Не верно!");
        }
    }

    @After
    public static void AfterClass() {
        System.out.println("AfterClass beginning!");
    }
}
