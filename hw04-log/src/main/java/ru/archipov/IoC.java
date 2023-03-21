package ru.archipov;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


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

            if (method.isAnnotationPresent(Log.class) &&args.length== 1) {
                System.out.println("executed method: " + method.getName() + ", param: " + args[0]);
            } else if (method.isAnnotationPresent(Log.class) &&args.length== 2) {
                System.out.println("executed method: " + method.getName() + ", param: " + args[0] + ", " + args[1]);
            } else if (method.isAnnotationPresent(Log.class) &&args.length== 3) {
                System.out.println("executed method: " + method.getName() + ", param: " + args[0] + ", " + args[1] + ", " + args[2]);
            }
            return method.invoke(myClass, args);
        }
    }
}

