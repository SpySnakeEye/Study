package ru.archipov;

public class Demo {
    public void action() {

        new TestLogging().calculation(6);
    }

    public static void main(String[] args)  {
       Demo demo = new Demo();
       demo.action();
       TestLoggingInterface f = new TestLogging();
       TestLoggingInterface myClass = IoC.createMyClass(f);
       myClass.calculation(6);
    }
}


