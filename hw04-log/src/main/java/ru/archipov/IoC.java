package ru.archipov;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class IoC {

    static <T> T createMyClass(T object) {
        InvocationHandler handler = new DemoInvocationHandler(new TestLogging());
        return (T) Proxy.newProxyInstance(IoC.class.getClassLoader(),
                new Class<?>[] {TestLoggingInterface.class}, handler);
    }

    static class DemoInvocationHandler implements InvocationHandler {
        private final TestLoggingInterface myClass;

        DemoInvocationHandler(TestLoggingInterface myClass) {
            this.myClass = myClass;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if (method.isAnnotationPresent(Log.class)) {
                    System.out.println("executed method: " + method.getName() + ", param: " + args[0]);
                }

            return method.invoke(myClass, args);
        }

    }
}
