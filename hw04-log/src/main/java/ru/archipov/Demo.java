package ru.archipov;

public class Demo {
    public void action() {
        new TestLogging().calculation(6);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.action();
        TestLoggingInterface f = new TestLogging();
        TestLoggingInterface myClass = IoC.createMyClass(f);
        myClass.calculation(6);
        myClass.calculation(3, 8);

        TestLoggingInterface_2 f2 = new TestLogging();
        TestLoggingInterface_2 myClass2 = IoC.createMyClass(f2);
        myClass2.calculation(1, 2, "F");

        TestLoggingInterface_3 f3 = new TestLogging();
        TestLoggingInterface_3 myClass3 = IoC.createMyClass(f3);
        myClass3.calculation(1, 2, "F", "M");
    }
}



