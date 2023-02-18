package ru.archipov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException {
        run(ClassTest.class);
    }

    private static void run(Class<?> testClass) throws IllegalAccessException, NoSuchMethodException, InstantiationException {
        int goodTests = 0;
        int badTests = 0;

        Method[] methods = testClass.getDeclaredMethods();
        Object[] objects = new Object[methods.length];

        for (int i = 0; i < methods.length; i++) {

            if (methods[i].isAnnotationPresent(Test.class)) {

                try {
                    objects[i] = testClass.getConstructor().newInstance();

                    for (Method methodForBefore : methods) {
                        if (methodForBefore.isAnnotationPresent(Before.class)) {
                            methodForBefore.invoke(objects[i]);
                        }
                    }

                    methods[i].invoke(objects[i]);
                    goodTests++;

                    for (Method methodForAfter : methods) {
                        if (methodForAfter.isAnnotationPresent(After.class)) {
                            methodForAfter.invoke(objects[i]);
                        }
                    }

                } catch (AssertionError | InvocationTargetException e) {
                    badTests++;
                }
            }
        }
        System.out.println("Tests complete: " + goodTests);
        System.out.println("Tests not completed: " + badTests);
        int allTests = goodTests + badTests;
        System.out.println("All tests: " + allTests);
    }
}