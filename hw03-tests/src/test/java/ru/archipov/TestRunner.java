package ru.archipov;

//import org.apiguardian.api.API;
//import org.junit.platform.commons.annotation.Testable;

import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        ClassTest classTest = new ClassTest();
        run(classTest);
    }

    private static void run (Object testClass) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<?> clazz1 = testClass.getClass();
        Method[] methods1 = clazz1.getMethods();
        for (Method method : methods1) {
            if (method.isAnnotationPresent(Before.class)) {
                Before before = method.getAnnotation(Before.class);
                method.invoke(testClass);
            }
        }

        Class<?> clazz2 = testClass.getClass();
        Method[] methods2 = clazz1.getMethods();
        for (Method method : methods2) {
            if (method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                method.invoke(testClass);
            }

        }

        Class<?> clazz3 = testClass.getClass();
        Method[] methods3 = clazz1.getMethods();
        for (Method method : methods3) {
            if (method.isAnnotationPresent(After.class)) {
                After after = method.getAnnotation(After.class);
                method.invoke(testClass);
            }

        }
    }
}