package TestManager;

import Data.NumberTableClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTester<T> {
    private T testClass;

    public ClassTester(T testClass) {
        this.testClass = testClass;
    }

    public void startMultiThread(NumberTableClass numberTable) {

        Thread thread1 = getThread(numberTable);
        Thread thread2 = getThread(numberTable);

        try {
            thread1.start();
            thread2.start();

            thread1.join(3000);
            thread2.join(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Thread getThread(NumberTableClass numberTable) {
        return new Thread(() -> {
            Method method;
            try {
                method = testClass.getClass().getMethod("Do", NumberTableClass.class);
                method.invoke(testClass, numberTable);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
