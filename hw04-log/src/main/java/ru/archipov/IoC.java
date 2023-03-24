package ru.archipov;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.stream.Collectors;


public class IoC {

    static <T>T createMyClass(T object) {
        InvocationHandler handler = new DemoInvocationHandler(object);
        return (T) Proxy.newProxyInstance(IoC.class.getClassLoader(),
                object.getClass().getInterfaces(), handler);
    }

    static class DemoInvocationHandler implements InvocationHandler {
        private final Object myClass;

        DemoInvocationHandler(Object myClass) {
            this.myClass= myClass;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String params = Arrays.stream(args).map(Object::toString).collect(Collectors.joining(", "));
            if (method.isAnnotationPresent(Log.class)) {
                System.out.println("executed method: " + method.getName() + ", param: " + params);
            }
            return method.invoke(myClass, args);
        }
    }
}

