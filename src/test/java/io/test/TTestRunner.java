package io.test;

import java.lang.reflect.Method;

/**
 * @author woniper
 */
public class TTestRunner {

    void run(Class<?> clazz) {

    }

    public boolean isTestClass(Class<?> testClass) {
        if(testClass == null) {
            throw new IllegalArgumentException();
        }

        for (Method method : testClass.getMethods()) {
            if (method.getAnnotation(TTest.class) != null)
                return true;
        }

        return false;
    }
}
